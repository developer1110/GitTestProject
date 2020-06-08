DROP TABLE IF EXISTS emp;
DROP TABLE IF EXISTS dept;
CREATE TABLE dept (
  deptno int,
  dname varchar(14) default NULL,
  loc varchar(13) default NULL,
  primary key(deptno)
);

CREATE TABLE emp (
  empno int,
  ename varchar(10) default NULL,
  job varchar(9) default NULL,
  mgr int default NULL,
  hiredate date default NULL,
  sal decimal(7,2) default NULL,
  comm decimal(7,2) default NULL,
  deptno int default NULL,
  primary key(empno), constraint fk_deptno foreign key(deptno) references dept(deptno)
);

select * from emp