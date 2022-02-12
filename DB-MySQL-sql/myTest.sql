use myTest;
select * from employees;
drop table if exists PARAM;
create table PARAM(
paramname varchar(20) primary key,
paramvalue varchar(40)
);

delete from param where param.paramname='DSF';
insert into param(paramname,paramvalue) values('DSF',"127.0.0.1");
commit;
select a.paramname,a.paramvalue from param a;