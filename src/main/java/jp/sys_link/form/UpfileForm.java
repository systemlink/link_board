package jp.sys_link.form;

import org.apache.struts.upload.FormFile;

public class UpfileForm {

	private String id;

	private String fileName;

	private byte[] file;

	private String billboardId;

	private FormFile formFile;

	private FormFile[] formFiles;

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
	public String getBillboardId() {
	    return billboardId;
	}

	/**
	 * billboardIdを設定します。
	 * @param billboardId billboardId
	 */
	public void setBillboardId(String billboardId) {
	    this.billboardId = billboardId;
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

	/**
	 * formFilesを取得します。
	 * @return formFiles
	 */
	public FormFile[] getFormFiles() {
	    return formFiles;
	}

	/**
	 * formFilesを設定します。
	 * @param formFiles formFiles
	 */
	public void setFormFiles(FormFile[] formFiles) {
	    this.formFiles = formFiles;
	}
}
