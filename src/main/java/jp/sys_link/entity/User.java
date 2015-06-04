package jp.sys_link.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "user_no")
	private String userNo;

	@Column
	private String name;

	@OneToMany(mappedBy = "user")
	private List<Billboards> billboardsList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Billboards> getBillboardsList() {
		return billboardsList;
	}

	public void setBillboardsList(List<Billboards> billboardsList) {
		this.billboardsList = billboardsList;
	}


}
