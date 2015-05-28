package jp.sys_link.form;

import org.apache.struts.upload.FormFile;
import org.seasar.struts.annotation.Required;

public class BillboardForm {

	private String id = "";

	@Required
	private String title = "";

	@Required
	private String note = "";

	@Required
	private String billboardGroupId = "";

	private String user_id = "";

	private String createdAt = "";

	public FormFile formFile;

	public FormFile[] formFiles;

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

}