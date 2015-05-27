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
	private Integer id;

	@Column(name = "file_name")
	private String fileName;

	private byte[] file;

	@Column(name = "billboard_id")
	private Integer billboardId;

	@ManyToOne
	@JoinColumn(name = "billboard_id", referencedColumnName = "id")
	private Billboard billboard;

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
	 * fileNameを取得します。
	 * @return fileName
	 */
	public String getFileName() {
	    return fileName;
	}

	/**
	 * fileNameを設定します。
	 * @param fileName fileName
	 */
	public void setFileName(String fileName) {
	    this.fileName = fileName;
	}

	/**
	 * fileを取得します。
	 * @return file
	 */
	public byte[] getFile() {
	    return file;
	}

	/**
	 * fileを設定します。
	 * @param file file
	 */
	public void setFile(byte[] file) {
	    this.file = file;
	}

	/**
	 * billboardIdを取得します。
	 * @return billboardId
	 */
	public Integer getBillboardId() {
	    return billboardId;
	}

	/**
	 * billboardIdを設定します。
	 * @param billboardId billboardId
	 */
	public void setBillboardId(Integer billboardId) {
	    this.billboardId = billboardId;
	}

	/**
	 * billboardを取得します。
	 * @return billboard
	 */
	public Billboard getBillboard() {
	    return billboard;
	}

	/**
	 * billboardを設定します。
	 * @param billboard billboard
	 */
	public void setBillboard(Billboard billboard) {
	    this.billboard = billboard;
	}

}