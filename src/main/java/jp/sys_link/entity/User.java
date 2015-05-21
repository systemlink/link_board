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
	public Integer id;

	@Column(name = "user_no")
	public String userNo;

	@Column
	public String name;

	@OneToMany(mappedBy = "user")
	public List<Billboards> billboardsList;
}
