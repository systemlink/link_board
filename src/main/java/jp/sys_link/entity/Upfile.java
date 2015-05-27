package jp.sys_link.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Upfile {

	@Id
	@GeneratedValue
	public Integer id;

	@Column(name = "file_name")
	public String fileName;

	public byte[] file;

	@Column(name = "billboard_id")
	public Integer billboardId;

	@ManyToOne
	@JoinColumn(name = "billboard_id", referencedColumnName = "id")
	public Billboard billboard;

}