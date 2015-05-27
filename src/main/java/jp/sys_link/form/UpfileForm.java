package jp.sys_link.form;

import org.apache.struts.upload.FormFile;

public class UpfileForm {

	private String id = "";

	private String fileName = "";

	private byte[] file;

	private String billboardId = "";

	private FormFile formFile;

	private FormFile[] formFiles;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getBillboardId() {
		return billboardId;
	}

	public void setBillboardId(String billboardId) {
		this.billboardId = billboardId;
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

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}


}
