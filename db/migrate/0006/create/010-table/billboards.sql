create table BILLBOARDS (
    ID int not null auto_increment,
    created_at timestamp,
    user_id int,
    billboard_group_id int,
    NOTE varchar(255),
    TITLE varchar(255),
    constraint BILLBOARDS_PK primary key(ID)
);
