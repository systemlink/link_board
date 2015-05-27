package jp.sys_link.form;

import org.apache.struts.upload.FormFile;
import org.seasar.struts.annotation.Required;

public class BillboardsForm {

	private String id = "";

	@Required(target = "insert,update")
	private String title = "";

	@Required(target = "insert,update")
	private String note = "";

	@Required(target = "insert,update")
	private String billboardGroupId = "";

	private String userId = "";

	private String createdAt = "";

	private FormFile formFile;

	private FormFile[] formFiles;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getBillboardGroupId() {
		return billboardGroupId;
	}

	public void setBillboardGroupId(String billboardGroupId) {
		this.billboardGroupId = billboardGroupId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public FormFile getFormFile() {
		return formFile;
	}

	public void setFormFile(FormFile formFile) {
		this.formFile = formFile;
	}

	public FormFile[] getFormFiles() {
		return formFiles;
	}

	public void setFormFiles(FormFile[] formFiles) {
		this.formFiles = formFiles;
	}

}