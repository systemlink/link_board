create table name_mst (
    ID int not null auto_increment,
    created_at timestamp,
    NAME varchar(255),
    CODE varchar(255),
    code_id_name varchar(255),
    code_id varchar(255),
    constraint name_mst_PK primary key(ID)
);
