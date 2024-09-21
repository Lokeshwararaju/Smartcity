package com.medplus.smartcity.service;


import java.util.List;

import com.medplus.smartcity.beans.User;
import com.medplus.smartcity.dto.AdminUserDisplay;
import com.medplus.smartcity.dto.RegistrationDto;

public interface UserService {
	int addUser(RegistrationDto reg);
	int deleteUser(String UserName);
	int updateUser(User user);
	int changePassword(String newpassWord, String oldPassword, String userName);
	String LoginValidation(String userName , String password);
	List<AdminUserDisplay> getAllUsers();
}
