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
	private Integer id;

	private String title;

	private String note;

	@Column(name = "billboard_group_id")
	private Integer billboardGroupId;

	private Integer user_id;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "billboard_group_id", referencedColumnName = "id")
	private NameMst nameMst;

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at")
	private Date createdAt;

	@OneToMany(mappedBy = "billboard")
	private List<Upfile> upfileList;

	/**
	 * idを取得します。
	 * @return id
	 */
	public Integer getId() {
	    return id;
	}

	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(Integer id) {
	    this.id = id;
	}

	/**
	 * titleを取得します。
	 * @return title
	 */
	public String getTitle() {
	    return title;
	}

	/**
	 * titleを設定します。
	 * @param title title
	 */
	public void setTitle(String title) {
	    this.title = title;
	}

	/**
	 * noteを取得します。
	 * @return note
	 */
	public String getNote() {
	    return note;
	}

	/**
	 * noteを設定します。
	 * @param note note
	 */
	public void setNote(String note) {
	    this.note = note;
	}

	/**
	 * billboardGroupIdを取得します。
	 * @return billboardGroupId
	 */
	public Integer getBillboardGroupId() {
	    return billboardGroupId;
	}

	/**
	 * billboardGroupIdを設定します。
	 * @param billboardGroupId billboardGroupId
	 */
	public void setBillboardGroupId(Integer billboardGroupId) {
	    this.billboardGroupId = billboardGroupId;
	}

	/**
	 * user_idを取得します。
	 * @return user_id
	 */
	public Integer getUser_id() {
	    return user_id;
	}

	/**
	 * user_idを設定します。
	 * @param user_id user_id
	 */
	public void setUser_id(Integer user_id) {
	    this.user_id = user_id;
	}

	/**
	 * userを取得します。
	 * @return user
	 */
	public User getUser() {
	    return user;
	}

	/**
	 * userを設定します。
	 * @param user user
	 */
	public void setUser(User user) {
	    this.user = user;
	}

	/**
	 * nameMstを取得します。
	 * @return nameMst
	 */
	public NameMst getNameMst() {
	    return nameMst;
	}

	/**
	 * nameMstを設定します。
	 * @param nameMst nameMst
	 */
	public void setNameMst(NameMst nameMst) {
	    this.nameMst = nameMst;
	}

	/**
	 * createdAtを取得します。
	 * @return createdAt
	 */
	public Date getCreatedAt() {
	    return createdAt;
	}

	/**
	 * createdAtを設定します。
	 * @param createdAt createdAt
	 */
	public void setCreatedAt(Date createdAt) {
	    this.createdAt = createdAt;
	}

	/**
	 * upfileListを取得します。
	 * @return upfileList
	 */
	public List<Upfile> getUpfileList() {
	    return upfileList;
	}

	/**
	 * upfileListを設定します。
	 * @param upfileList upfileList
	 */
	public void setUpfileList(List<Upfile> upfileList) {
	    this.upfileList = upfileList;
	}

}