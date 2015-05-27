package jp.sys_link.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Billboard {

	@Id
	@GeneratedValue
	public Integer id;

	public String title;

	public String note;

	@Column(name = "billboard_group_id")
	public Integer billboardGroupId;

	public Integer user_id;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	public User user;

	@ManyToOne
	@JoinColumn(name = "billboard_group_id", referencedColumnName = "id")
	public NameMst nameMst;

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at")
	public Date createdAt;

	@OneToMany(mappedBy = "billboard")
	public List<Upfile> upfileList;

}