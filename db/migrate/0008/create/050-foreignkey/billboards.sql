alter table BILLBOARDS add constraint BILLBOARDS_FK1 foreign key (user_id) references USER (id);
alter table BILLBOARDS add constraint BILLBOARDS_FK2 foreign key (billboard_group_id) references name_mst (id);
