drop database smartcity;
create database smartcity;
use smartcity;
create table user(userid int primary key ,
username varchar(50) not null unique,
nameofuser varchar(50) not null,
password varchar(50) not null ,
role varchar(10) not null,
mobilenumber Numeric(10) not null,
mail varchar(50) unique);

create table touristplace(placeid int primary key,
placename varchar(100) not null,
location varchar(50) not null,
placetype varchar(50) not null,
details varchar(200),
pincode Numeric(6) not null);

create table hotel(hotelid int primary key,
hotelname varchar(50) not null,
rating Numeric(2,1),
location varchar(50) not null,
amenities varchar(100) not null,
contactdetails varchar(200) not null,
constraint rating_check check (rating >=1 and rating <=5));


create table hotelroom(roomid int primary key,
roomtype varchar(30) not null,
pricepernight double not null,
hotelid int not null,
guestcapacity int not null,
numberofrooms  int not null,
constraint hotelid_fk foreign key(hotelid) references hotel(hotelid) on delete cascade);

create table bookingdetails(bookingid int primary key,
userid int,
hotelid int,
roomid int,
countofrooms int  not null,
checkin date not null,
checkout date not null,
totalpayableamount double not null,
bookingstatus varchar(20) not null,
constraint user_fk foreign key(userid) references user(userid) on delete cascade,
constraint hotel_fk foreign key(hotelid) references hotel(hotelid) on delete cascade,
constraint room_fk foreign key(roomid) references hotelroom(roomid) on delete cascade);

create table institution(instituteid int primary key,
institutename varchar(100) not null,
location varchar(50) not null,
institutetype varchar(30) not null,
coursefee double not null,
coursesoffered varchar(100) not null,
coursetype varchar(50) not null,
courseduration varchar(50) ,
contactdetails varchar(200) not null);

create table jobdetails(jobid int primary key,
jobtitle varchar(50) not null,
companyname varchar(50) not null,
jobtype varchar(50) not null,
skillsrequired varchar(300) not null,
salary varchar(100) not null,
details varchar(200) not null);

create table jobapplicants(applicationid int primary key,
userid int ,
jobid int,
appliedon date not null,
constraint job_userid_fk foreign key(userid) references user(userid) on delete cascade,
constraint job_jobid_fk foreign key(jobid) references jobdetails(jobid) on delete cascade);

create table business(businessid int primary key,
companyname varchar(50) not null,
businesstype varchar(50) ,
information varchar(200) ,
contactdetails varchar(200) not null,
location varchar(50) not null);