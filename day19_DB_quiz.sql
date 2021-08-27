create table member(
    id varchar2(20),
    name varchar2(20),
    gender varchar(10),
    age number,
    addr varchar2(40),
    primary key(id)
);

select * from member;

commit;