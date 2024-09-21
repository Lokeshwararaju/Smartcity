package com.medplus.smartcity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.medplus.smartcity.beans.Business;
import com.medplus.smartcity.utils.DBQueries;

public class BusinessDaoimpl implements BusinessDao{
	
	@Autowired
	NamedParameterJdbcTemplate namedTemplate;

	@Override
	public int addBussiness(Business business) {
		business.setBusinessId(this.generateId());
		int rows = -1;
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("businessid", business.getBusinessId());
		params.addValue("companyname", business.getCompanyName());
		params.addValue("businesstype", business.getBusinessType());
		params.addValue("information", business.getInformation());
		params.addValue("contactdetails", business.getContactDetails());
		params.addValue("location", business.getLocation());
		rows = namedTemplate.update(DBQueries.ADDBUSINESS, params);
		return rows;
	}

	@Override
	public List<Business> getBusiness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Business> searchBusiness(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateBusiness(Business business) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Business getBusinessbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int generateId() {
		return namedTemplate.query(DBQueries.GENERATEBID, new ResultSetExtractor<Integer>() {

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
}
