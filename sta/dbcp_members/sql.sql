create table member(
	userid varchar2(15) primary key,
	password varchar2(20) not null,
	name nvarchar2(20) not null,
	gender nvarchar2(10) not null,
	email varchar2(50) not null
);

insert into member values('mukno','mukno!@','홍길동','남','mukno@naver.com');
select *from member;

select count(*) from MEMBER where userid='mukno' and password='mukno!@';



