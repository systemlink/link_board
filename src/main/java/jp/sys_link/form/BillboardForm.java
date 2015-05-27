package jp.sys_link.form;

import org.seasar.struts.annotation.Required;

public class BillboardForm {

	public String id = "";

	@Required
	public String title = "";

	@Required
	public String note = "";

	@Required
	public String billboardGroupId = "";

	public String user_id = "";

	public String createdAt = "";

}