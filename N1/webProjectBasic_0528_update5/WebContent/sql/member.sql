use javastudy;

select * from member;

desc member;
select count(*) from  member where userId='222' and userPw='222';

create database m1;


select userId,userPw,userName,userAge from  member where userId='1';

create table if not exists memberBord(
no int auto_increment not null,
userId varchar(100) not null,
bordPw varchar(100) not null,
title varchar(300) not null,
content varchar(500) not null,
primary key(no)
);

desc memberBord;