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
public class Billboards {

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String title;

	@Column
	private String note;

	@Column(name = "billboard_group_id")
	private Integer billboardGroupId;

	@Column(name = "user_id")
	private Integer userId;

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at")
	private Date createdAt;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "billboard_group_id", referencedColumnName = "id")
	private NameMst nameMst;

	@OneToMany(mappedBy = "billboards")
	private List<Upfile> upfileList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getBillboardGroupId() {
		return billboardGroupId;
	}

	public void setBillboardGroupId(Integer billboardGroupId) {
		this.billboardGroupId = billboardGroupId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public NameMst getNameMst() {
		return nameMst;
	}

	public void setNameMst(NameMst nameMst) {
		this.nameMst = nameMst;
	}

	public List<Upfile> getUpfileList() {
		return upfileList;
	}

	public void setUpfileList(List<Upfile> upfileList) {
		this.upfileList = upfileList;
	}
}