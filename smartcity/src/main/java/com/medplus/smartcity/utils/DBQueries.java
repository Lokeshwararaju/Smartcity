package com.medplus.smartcity.utils;

public class DBQueries {
	public static final String ADDUSER = "insert into user (userid, username, password, role, mobilenumber, mail, nameofuser) values(:userid, :username, :password,'user', :mobilenumber, :mail, :nameofuser)";
	public static final String USERINSERTVALIDATION = "select count(userid), userid from user where username = :userName || mobilenumber = :mobilenumber || mail = :mail";
	public static final String GETLASTMAXID = "select userid from user where userid = (select max(userid) from user)";
	public static final String DELETEUSER = "delete from user where username = :userName";
	public static final String UPDATEUSER = "update user set username = :userName , mobilenumber = :mobileNumber, mail = :mail, nameofuser = :nameofuser where userid = :userid";
	public static final String GETPASSWORD = "select password from user where username = :userName";
	public static final String UPDATEPASSWORD = "update user set password = :newPassword where username = :userName";
	public static final String USERLOGINVALIDATION = "select role from user where username = :userName and password = :password ";
	public static final String GETALLUSERS = "select username, mobilenumber, nameofuser, mail from user";
	public static final String ADDBUSINESS = "insert into business(businessid , companyname, businesstype, information, contactdetails, location) value (:businessid , :companyname, :businesstype, :information, :contactdetails, :location)";
	public static final String GENERATEBID = "select businessid from business where businessid = (select max(businessid) from business)";
}