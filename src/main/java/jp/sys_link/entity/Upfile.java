package jp.sys_link.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Upfile {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "file_name")
	private String fileName;

	@Column
	@Lob
	private byte[] file;

	@Column(name = "billboard_id")
	private Integer billboardId;

	@ManyToOne
	@JoinColumn(name = "billboard_id", referencedColumnName = "id")
	private Billboards billboards;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public Integer getBillboardId() {
		return billboardId;
	}

	public void setBillboardId(Integer billboardId) {
		this.billboardId = billboardId;
	}

	public Billboards getBillboards() {
		return billboards;
	}

	public void setBillboards(Billboards billboards) {
		this.billboards = billboards;
	}

}
