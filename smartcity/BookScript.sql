SELECT * FROM medplus.book;
use medplus;
insert into book values(105,'Dinesh 5', 'Dinesh', 'DVV Publications', 2022, 1000);

show tables;

create table user(
userName varchar(20) primary key,
password varchar(20) not null,
role varchar(10) default 'user' not null);

desc user;
select * from user;

insert into user value('user', 'user', 'user');


select role from user where userName ='' OR 1=1 -- and password = 'dinesh';

