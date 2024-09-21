package com.medplus.smartcity.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medplus.smartcity.beans.User;
import com.medplus.smartcity.dao.UserDaoImpl;
import com.medplus.smartcity.dto.AdminUserDisplay;
import com.medplus.smartcity.dto.RegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDaoImpl udao;
	
	@Override
	public int addUser(RegistrationDto reg) {
		return udao.addUser(reg);
	}

	@Override
	public int deleteUser(String userName) {
		return udao.deleteUser(userName);
	}

	@Override
	public int updateUser(User user) {
		return udao.updateUser(user);
	}

	@Override
	public int changePassword(String newpassWord, String oldPassword, String userName) {
		return udao.changePassword(oldPassword, newpassWord, userName);
	}

	@Override
	public String LoginValidation(String userName, String password) {
		return udao.LoginValidation(userName , password);
	}

	@Override
	public List<AdminUserDisplay> getAllUsers() {
		return udao.getAllUsers();
	}

}
