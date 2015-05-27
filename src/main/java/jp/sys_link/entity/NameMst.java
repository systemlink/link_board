package jp.sys_link.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "name_mst")
public class NameMst {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "code_id")
	private String codeId;

	@Column(name = "code_id_name")
	private String codeIdName;

	private String code;

	private String name;

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at")
	private Timestamp createdAt;

	@OneToMany(mappedBy = "nameMst")
	private List<Billboards> billboardsList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getCodeIdName() {
		return codeIdName;
	}

	public void setCodeIdName(String codeIdName) {
		this.codeIdName = codeIdName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public List<Billboards> getBillboardsList() {
		return billboardsList;
	}

	public void setBillboardsList(List<Billboards> billboardsList) {
		this.billboardsList = billboardsList;
	}

}
