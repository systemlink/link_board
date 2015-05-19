package jp.sys_link.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import java.sql.Timestamp;


@Entity
public class Billboards {

    @Id
    @GeneratedValue
    public Integer id;

    public String title;

    public String note;

    @Column(name="billboard_group_id")
    public Integer billboardGroupId;

    @Column(name="user_id")
    public Integer userId;

    @Temporal(TemporalType.DATE)
    @Column(name="created_at")
    public Timestamp createdAt;

    @Temporal(TemporalType.DATE)
    @Column(name="updated_at")
    public Timestamp updatedAt;

}