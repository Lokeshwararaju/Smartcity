package com.medplus.smartcity.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medplus.smartcity.beans.User;
import com.medplus.smartcity.dto.AdminUserDisplay;
import com.medplus.smartcity.dto.LoginDto;
import com.medplus.smartcity.dto.RegistrationDto;
import com.medplus.smartcity.service.UserServiceImpl;

@RestController
@RequestMapping(value = "/")
public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	@GetMapping(value = "login")
	ResponseEntity<String> loginValidation(@RequestBody LoginDto logindata){
		String role = userService.LoginValidation(logindata.getUserName(), logindata.getPassword());
		
		if(role == null) {
			return new ResponseEntity<String>("Login details Not found! Sign Up to login", HttpStatus.OK);
		}
		else {
			if(role.equals("admin")) {
				return new ResponseEntity<String>("Admin   Tourism   Student   Jobseekers   Bussiness \n changepassword \n updatedetails", HttpStatus.OK);
			}
			else
				return new ResponseEntity<String>("Tourism   Student   Jobseekers   Bussiness \n changepassword \n updatedetails", HttpStatus.OK);
		}
	}
	
	@PostMapping(value = "registration")
	ResponseEntity<String> userRegistration(@RequestBody RegistrationDto reg){
		int rows = userService.addUser(reg);
		if(rows == 1) {
			return new ResponseEntity<String>("User Added Sucessfully " , HttpStatus.OK);
		}
		return new ResponseEntity<String>("User already Exist! please Login", HttpStatus.OK);
	}
	
	@PutMapping(value = "login/updatedetails")
	ResponseEntity<String> updateUser(@RequestBody User user){
		int rows = userService.updateUser(user);
		if(rows == 1) {
			return new ResponseEntity<String>("Changes Updated Sucessfully " , HttpStatus.OK);
		}
		return new ResponseEntity<String>("Failed to update user " , HttpStatus.OK);
	}
	
	@GetMapping(value = "login/admin")
	ResponseEntity<String> adminModule(){
		return new ResponseEntity<String>("usermanagement", HttpStatus.OK);
	}
	
	@GetMapping(value = "login/admin/usermanagement")
	ResponseEntity<List<AdminUserDisplay>> getAllusers(){
		return new ResponseEntity<List<AdminUserDisplay>>(userService.getAllUsers(), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "login/admin/usermanagement/{username}")
	ResponseEntity<String> deleteUser(@PathVariable(name = "username") String userName){
		int rows = userService.deleteUser(userName);
		if(rows == 1) {
			return new ResponseEntity<String>("User Sucessfully deleted" , HttpStatus.OK);
		}
		return new ResponseEntity<String>("Failed to delete user " , HttpStatus.OK);
	}
	
	@PutMapping(value = "login/changepassword")
	ResponseEntity<String> changePassword(@RequestBody HashMap<String, String> passDetails){
		int rows = userService.changePassword(passDetails.get("newPassword"), passDetails.get("currPassword"), passDetails.get("userName"));
		if(rows == 1) {
			return new ResponseEntity<String>("Password updated sucessfully " , HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Please enter Old password correctly " , HttpStatus.OK);
		
	}
}
