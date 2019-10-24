select *from SPRING_BOARD;




insert into spring_board(bno,title,content,writer) 
(select seq_board.nextVal,title,content,writer from spring_board);



--rownum:가상컬럼(임시부여)
select rownum,bno,title from spring_board where rownum<=1;



create table spring_reply(
	rno number(10,0) constraint pk_reply primary key, -- 댓글글번호
	bno number(10,0) not null, --spirng
	reply varchar2(1000) not null,
	replyer varchar2(50) not null,
	replyDate date default sysdate,
	updateDate date default sysdate,
	constraint fk_reply_board foreign key(bno)
	references spring_board(bno)


)



create sequence seq_reply;
drop sequence seq_reply;


select *from spring_reply;
drop table spring_reply;


select *from spring_reply where rno=23;
select *from SPRING_BOARD;

--인데스 생성 
create index idx_reply on spring_reply(bno desc,rno asc);

--댓글수 처리를 위한 칼럼 추가
alter table spring_board add(replyCnt number default 0);

update SPRING_BOARD 
set replyCnt=(select count(rno) from SPRING_REPLY where SPRING_REPLY.bno=SPRING_BOARD.bno);



-- rownum : 가상컬럼(임시 부여)
select rownum, bno, title from spring_board where rownum <= 10;

-- rownum 과 order by는 같이 쓸때 주의(rownum의 우선순위가 높음)

-- spring_board에서 최신글 10개 가져오기
select rownum,bno,title,writer
from (select bno,title,writer from SPRING_BOARD order by bno desc)
where rownum<=20;


select rownum,bno,title,writer
from (select 
bno,title,writer from SPRING_BOARD)
where rownum<=20;


-- 최신글 1~10개 가져오기
select bno,title,writer
from (select 
       rownum rn,bno,title,writer from SPRING_BOARD where rownum<=10)
where rn>0;

-- 최신글 11~20개 가져오기
select bno,title,writer,regdate
from (select /*+INDEX_DESC(spring_board pk_spring_board)*/
       rownum rn,bno,title,writer from SPRING_BOARD where rownum<=20)
where rn>10;


create table spring_attach(
	uuid varchar2(100) not null,
	uploadPath varchar2(200) not null,
	fileName varchar2(100) not null,
	fileType char(1) default 'I',
	bno number(10,0)

)
alter table spring_attach add constraint pk_attach primary key(uuid);
alter table spring_attach add constraint fk_board_attach foreign key(bno)
references spring_board(bno);




			    