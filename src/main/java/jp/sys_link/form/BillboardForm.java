package jp.sys_link.form;

import org.apache.struts.upload.FormFile;
import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.Required;

public class BillboardForm {

	private String id = "";

	@Required(target = "insert,update")
	private String title = "";

	@Required(target = "insert,update")
	private String note = "";

	@Required(target = "insert,update")
	private String billboardGroupId = "";

	private String user_id = "";

	@DateType(datePattern = "yyyy-MM-dd",target = "searchDate")
	private String createdAt = "";

	private String fileName;

	private byte[] file;

	public FormFile formFile;

	/**
	 * idを取得します。
	 * @return id
	 */
	public String getId() {
	    return id;
	}

	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(String id) {
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
	public String getBillboardGroupId() {
	    return billboardGroupId;
	}

	/**
	 * billboardGroupIdを設定します。
	 * @param billboardGroupId billboardGroupId
	 */
	public void setBillboardGroupId(String billboardGroupId) {
	    this.billboardGroupId = billboardGroupId;
	}

	/**
	 * user_idを取得します。
	 * @return user_id
	 */
	public String getUser_id() {
	    return user_id;
	}

	/**
	 * user_idを設定します。
	 * @param user_id user_id
	 */
	public void setUser_id(String user_id) {
	    this.user_id = user_id;
	}

	/**
	 * createdAtを取得します。
	 * @return createdAt
	 */
	public String getCreatedAt() {
	    return createdAt;
	}

	/**
	 * createdAtを設定します。
	 * @param createdAt createdAt
	 */
	public void setCreatedAt(String createdAt) {
	    this.createdAt = createdAt;
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
	 * formFileを取得します。
	 * @return formFile
	 */
	public FormFile getFormFile() {
	    return formFile;
	}

	/**
	 * formFileを設定します。
	 * @param formFile formFile
	 */
	public void setFormFile(FormFile formFile) {
	    this.formFile = formFile;
	}

}