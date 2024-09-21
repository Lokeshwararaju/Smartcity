insert into user (userid, username,nameofuser, password, role, mobilenumber, mail) values
(1, 'admin_01','raju', 'admin@1234', 'admin', 1234500001, 'abc@gmail.com'),
(2, 'rani_01','rani', 'rani@12345', 'user', 1234500003, 'abc@yahoo.com'),
(3, 'rani_011','rani', 'rani*67890', 'user', 1234500004, NULL),
(4,'vani_022','vani','vvanni@123','user',9879987889,'vani');


insert into hotel(hotelid,hotelname,rating,location,amenities,contactdetails) values
(101,'LemonTree',4.8,'HITEC-CITY,Hyderabad','Pool,Fitness center,Room Service,Laundry,Front Desk','Plot No.2,Survey No.64,Hyd'),
(102,'Hotel Yellow Bells',5,'Gachibowli,Hyderabad','Wifi,Breakfast,Parking,Airport shuttle,Enhanced Cleaning','07386300418'),
(103,'The Manohar,Hyderabad',3.7,'15 km from ancient city of Golconda','Enhanced cleaning,personal protection,physical distancing,food safety',
'Begumpet,Hyderabad,Telangana 500016 04066543456');


insert into touristplace(placeid,placename,location,placetype,details,pincode) values
(1,'charminar', 'pattergatti Road,Hyderabad','tourism spot', 'Must visit place in hyderabad since 1600. Avaliable to visit any time', 500012),
(2,'Golconda fort', 'Khair Complex,Ibrahim Bagh, hyderabad','tourism spot', 'Golkonda loacted in western part of city and is 9 kms away from hussain sagar. Visiting time 16:00 to 21:00', 500012),
(3,'Ramoji Film city', 'Abdullahpurmet,Vijayawada Highway,hyderabad','tourism spot', 'One of must visit place in Hyderabad since 1991. Visiting time 9:00 to 21:30', 500052),
(4,'InOrbit mall', 'Cyberabad,Inorbit Mall Rd,hyderabad','mall', 'Popular mall near to hitec city  Visiting time 11:00 to 22:30', 500081),
(5,'KLM shopping', 'Ameerpet Rd,punjagutta,hyderabad','Shopping Center', 'popular place to but cloths Visiting time 10:00 to 21:30', 500052),
(6,'SBI ATM', 'MJ Road,Osman gunj,hyderabad','ATM', 'Place to withdraw money. Available to visit any time', 500122),
(7,'Central Library', 'Afzal Gunj,hyderabad','Library', 'Place to get books and read books. Available to visit any time', 500122);

insert into institution(instituteid,institutename,location,institutetype,coursefee,coursesoffered,coursetype,courseduration,contactdetails)values
(1,'JSpiders' ,'Kukatpally' ,'coaching institute',40000,'java full stack ,Testing','full time , offline','6 months' ,'JSpiders, Opposite to Jntu, Kukatpally KPHB,Hyderabad-500018. Mobile no;-9123456789'),
(2,'Delhi Public school','Begumpet','school',350000,'CBSE','fulltime',null,'1-11 87 & 88, Sardar Patel Rd, Begumpet, Hyderabad, Telangana 500016'),
(3,'Mahindra university','Bahadurpalli','Deemed University',400000,'B.Tech,B.com,BBA,LLB,','full time, offline',null,'Survey No: 62/1A, Bahadurpally, Jeedimetla, Hyderabad, Telangana 500043 , contact.Number:040 6713 5100'),
(4,'Nizam college of Arts','Gun fondry','college',10000,'B.Sc,BA ,BCA,MCA,M.Sc,B.com','part time and full time',null,'LB Stadium Rd, Gun Foundry, Basheer Bagh, Hyderabad, Telangana 500001');

insert into hotelroom (roomid,roomtype,pricepernight,hotelid,guestcapacity,numberofrooms)
values(1,'Standard-NON-AC',5600,101,2,10),
(2,'Standard-AC',10800,101,2,5),
(3,'Suite',28000,101,3,3),
(4,'Standard-NON-AC',1980,102,1,15),
(5,'Standard-AC',2340,102,2,10),
(6,'Standard-AC',1999,103,2,7),
(7,'Standard-NON-AC',1200,103,2,20),
(8,'Suite',4567,103,4,5);


insert into business(businessid , companyname, businesstype, information, contactdetails, location) values
(1, 'volkswagen', 'Automobile manufacturer', 'Volkswagen is a german native popular company that produces automobiles', 'email:customer.care@volkswagen.co.in , Toll free Number: 1800 102 0909', 'KPHP'),
(2, 'DR Reddies', 'Pharma manufacturer', 'Dr reddies is a popular indian pharma company that produces medicines in large scale', 'email:customerservices@drreddys.com , Toll free Number:  1800 425 0014', ''),
(3, 'TCS', 'Software services', 'A indian MNC that provides software solutions to other organisations', 'email:customerservices@tcs.com , Toll free Number:  1800 485 301', 'madhapur'),
(4, 'medplus', 'Retail business', 'medplus is a retail company that sells pharma products in different states in india', 'email:customerservices@medplusindia.com , Toll free Number:  1820 425 0014', 'jublie hills');


insert into jobdetails (jobid, jobtitle, companyname, jobtype, skillsrequired, salary, details) values
(1,'Associate Software Engineer','Medplus Pvt Ltd','Full-time','Java,Python,HTML,JavaScript,CSS,Data Structures','6L CTC Per Year Plus 2L Joining Bonus','Any BE/B.Tech/ME/M.Tech/BCA/MCA qualification with good analytical and coding skills Year of Graduation – 2020 / 2021 / 2022'),
(2, 'International Customer Support ', 'The Job Factory', 'Work from office,Rotational Shift',' flexible,Good English Communication Skills,Experience in BPO (0-4)', '₹ 1,00,000 - 3,00,000 P.A.','Good Incentives and Night shift allowance; Education: UG,PG AnySpecialization'),
(3,'Assistant Executive/Executive', 'Shriram Transport Finance Company Limited', 'Part time','Internal Audit,MISReporting,Auditing,ACCOUNTS','₹ 50,000 - 2,50,000 P.A.','Qualification:Commerce Graduate/PG;Age : Below 28 years (Only Male Candidate);Experience : 0-4 Years in Audit/Accounts');


insert into jobapplicants(applicationid, userid, jobid, appliedon)values
(1, 3, 3, '2022-10-21'),
(2, 4, 1, '2022-10-01'),
(3, 4, 2, '2022-11-03'),
(4,4,1,'2022-9-02');


insert into bookingdetails values
(1,3,101,2,5,'2022-11-24','2022-11-26',4500,'confirmed');
