package jp.sys_link.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Billboards {

	@Id
	@GeneratedValue
	public Integer id;

	@Column
	public String title;

	@Column
	public String note;

	@Column(name = "billboard_group_id")
	public Integer billboardGroupId;

	@Column(name = "user_id")
	public Integer userId;

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at")
	public Timestamp createdAt;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	public User user;
}