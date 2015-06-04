create table UPFILE (
    ID int not null auto_increment,
    billboard_id int,
    FILE binary(255),
    file_name varchar(255),
    constraint UPFILE_PK primary key(ID)
);
