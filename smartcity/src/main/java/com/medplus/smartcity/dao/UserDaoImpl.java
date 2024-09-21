package com.medplus.smartcity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medplus.smartcity.beans.User;
import com.medplus.smartcity.dto.AdminUserDisplay;
import com.medplus.smartcity.dto.RegistrationDto;
import com.medplus.smartcity.utils.DBQueries;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	NamedParameterJdbcTemplate namedTemplate;

	/*
	 * to add a user unique constraints of user must be checked with other users
	 * 
	 * */
	@Override
	public int addUser(RegistrationDto reg) {
		int rows = 0;
		int userId = this.generateId();
		int flag = this.userInsertValidation(reg);
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("userid", userId);
		params.addValue("username", reg.getUserName());
		params.addValue("password", reg.getPassword());
		params.addValue("role", "user");
		params.addValue("mobilenumber", reg.getMobileNumber());
		params.addValue("mail", reg.getMail());
		params.addValue("nameofuser", reg.getFullName());
		if(flag == 0) {
			rows = namedTemplate.update(DBQueries.ADDUSER, params);
		}
		return rows;
	}
	
	/*
	 * to delete a user user should be deleted in booking details, job applicants at first.
	 * 
	 * */
	@Override
	public int deleteUser(String userName) {
		return namedTemplate.update(DBQueries.DELETEUSER, new MapSqlParameterSource().addValue("userName", userName));
	}

	@Override
	public int updateUser(User user) {
		int flag = this.userInsertValidation(user);
		if(flag%10 == 1 && user.getUserId() == flag/10) {
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue("userid", user.getUserId());
			params.addValue("userName", user.getUserName());
			params.addValue("mobileNumber", user.getMobileNumber());
			params.addValue("mail", user.getMail());
			params.addValue("nameofuser", user.getNameOfUser());
			return namedTemplate.update(DBQueries.UPDATEUSER, params);
		}
		return 0;
	}
	
	private int userInsertValidation(RegistrationDto reg) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("userName", reg.getUserName());
		params.addValue("mobilenumber", reg.getMobileNumber());
		params.addValue("mail", reg.getMail());
		return namedTemplate.query(DBQueries.USERINSERTVALIDATION, params, new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					return rs.getInt("count(userid)");
				}
				else {
					return -1;
				}
			}
		});
	}
	
	private int userInsertValidation(User user) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("userName", user.getUserName());
		params.addValue("mobilenumber", user.getMobileNumber());
		params.addValue("mail", user.getMail());
		return namedTemplate.query(DBQueries.USERINSERTVALIDATION, params, new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int count = 0;
				int userId = -1;
				if(rs.next()) {
					count = rs.getInt("count(userid)");
					if(count == 0) {
						return count;
					}
					else {
						
						userId = rs.getInt("userid");
						return userId*10 + count;
					}
				}
				else {
					return -1;
				}
			}
		});
	}
	
	private int generateId() {
		return namedTemplate.query(DBQueries.GETLASTMAXID, new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					return rs.getInt("userid");
				}
				else {
					return -1;
				}
			}
		}) + 1;
	}

	@Override
	public int changePassword(String oldPassword, String newPassword, String userName) {
		String oldPass = this.getPassword(userName);
		if(oldPass.equals(oldPassword)) {
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue("newPassword", newPassword);
			params.addValue("userName", userName);
			return namedTemplate.update(DBQueries.UPDATEPASSWORD, params);
		}
		return 0;
	}
	
	@Override
	public String LoginValidation(String userName, String password) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("userName", userName);
		params.addValue("password", password);
		return namedTemplate.query(DBQueries.USERLOGINVALIDATION, params, new ResultSetExtractor<String>() {

			@Override
			public String extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					return rs.getString("role");
				}
				return null;
			}
		});
	}
	
	private String getPassword(String userName) {
		String currpass = namedTemplate.query(DBQueries.GETPASSWORD, new MapSqlParameterSource().addValue("userName", userName),new ResultSetExtractor<String>() {

			@Override
			public String extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					return rs.getString("password");
				}
				return null;
			}
		});
		return currpass;
	}

	@Override
	public List<AdminUserDisplay> getAllUsers() {
		List<AdminUserDisplay> userList = new ArrayList<AdminUserDisplay>();
		userList = namedTemplate.query(DBQueries.GETALLUSERS, BeanPropertyRowMapper.newInstance(AdminUserDisplay.class));
		return userList;
	}
}
