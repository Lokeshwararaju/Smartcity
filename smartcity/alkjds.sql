use smartcity;
desc user;
select * from user;
SELECT userid FROM user
WHERE userid = (SELECT max(userid) FROM user);

select count(userid) from user where username = 'testadmin1' || mobilenumber = '123450003'|| mail = 'abc@gmail.co';
select * from user;

insert into user value(5,'iamlegend', 'kqjhgwdc', 'user', 1872346, 'asdas', 'qaksdhgc');
delete from user where userid = 10;

update user set username = 'username' , mobilenumber = 8725412, mail = 'mymail', nameofuser = 'dinesh' where userid = 5;

select password from user where userid = 5;
update user set password = '827461234' where userid = 5;

select role from user where username = 'testadmn1' and password = 'admin@1234';

create table users(userid int primary key ,
username varchar(50) not null unique,
password varchar(50) not null ,
role varchar(10) not null,
mobilenumber Numeric(10) not null,
mail varchar(50) unique,
nameofuser varchar(30));

drop table users;

show tables;

desc business;

select businessid from bussiness where businessid = (select max(businessid) from bussiness);

create table bussiness(businessid int primary key,
companyname varchar(50) not null,
businesstype varchar(50) ,
information varchar(200) ,
contactdetails varchar(200) not null,
location varchar(50) not null);

drop table bussiness;
drop table users;

desc user;

select * from business;

select businessid, companyname, businesstype, information, contactdetails,location from business;

select businessid, companyname, businesstype, information, contactdetails,location from business where companyname like '%business%' || businesstype like '%Software%' || information like '%Volkswagen%' || contactdetails like '%tcs%' || location like '%jublie hills%';
create table bussiness(businessid int primary key,
companyname varchar(50) not null,
businesstype varchar(50) ,
information varchar(200) ,
contactdetails varchar(200) not null,
location varchar(50) not null);

select * from business;

select * from user;

select * from jobapplicants;

select * from touristplace;
select * from hotelroom;
select * from bookingdetails;
desc user;
select userid , username, nameofuser,role, mobilenumber from user where username = 'admin_01' and password = 'admin@1234';
