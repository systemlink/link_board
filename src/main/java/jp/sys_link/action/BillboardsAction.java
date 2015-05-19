package jp.sys_link.action;

import java.util.List;

import javax.annotation.Resource;

import jp.sys_link.entity.Billboards;
import jp.sys_link.form.BillboardsForm;
import jp.sys_link.service.BillboardsService;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class BillboardsAction {

	public List<Billboards> billboardsItems;

	@ActionForm
	@Resource
	protected BillboardsForm billboardsForm;

	@Resource
	protected BillboardsService billboardsService;

	public JdbcManager jdbcManager;

	@Execute(validator = false)
	public String index() {
	    billboardsItems = billboardsService.findAll();
		return "top.jsp";
	}

	@Execute(validator = false)
	public String cleate() {
		return "new.jsp";
	}

}