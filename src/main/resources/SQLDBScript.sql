
create database mitkoin;
 use MitKoin;
create table user(
id int,
name varchar(20),
password varchar(10)
);

create user 'springuser'@'localhost' identified by 'root'; -- Creates the user
grant select, insert, delete, update, create on springdb.* to 'springuser'@'localhost';
use MitKoin;
select * from user;
