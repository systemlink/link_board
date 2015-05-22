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
@Table(name="name_mst")
public class NameMst {

	@Id
	@GeneratedValue
	public Integer id;

	@Column(name = "code_id")
	public String codeId;

	@Column(name = "code_id_name")
	public String codeIdName;

	public String code;

	public String name;

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at")
	public Timestamp createdAt;

	@OneToMany(mappedBy = "nameMst")
	public List<Billboards> billboardsList;

}
