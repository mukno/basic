create table if not exists memberbord(
no int auto_increment not null,
userId varchar(100) not null,
bordPw varchar(100) not null,
title varchar(300) not null,
content varchar(500) not null,
primary key(no)
);

desc memberbord;