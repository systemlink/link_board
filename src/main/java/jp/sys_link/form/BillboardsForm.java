package jp.sys_link.form;

import org.seasar.struts.annotation.Required;

public class BillboardsForm {

	public String id = "";

	@Required
	public String title = "";

	@Required
	public String note = "";

	@Required(target = "insert,update")
	public String billboardGroupId = "";

	public String userId = "";

	public String createdAt = "";

	public String name = "";
}