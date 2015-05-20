package jp.sys_link.action;

import java.util.List;

import javax.annotation.Resource;

import jp.sys_link.entity.Billboards;
import jp.sys_link.form.BillboardsForm;
import jp.sys_link.service.BillboardsService;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class BillboardsAction {

	public List<Billboards> billboardsItems;

	@ActionForm
	@Resource
	private BillboardsForm billboardsForm;

	@Resource
	private BillboardsService billboardsService;

	@Resource
	private JdbcManager jdbcManager;

	@Execute(validator = false)
	public String index() {
		billboardsItems = billboardsService.findAll();
		return "top.jsp";
	}

	@Execute(validator = false)
	public String cleate() {
		return "new.jsp";
	}

	@Execute(validator = false, urlPattern = "show/{id}")
	public String show() {
		return "show.jsp";
	}

	@Execute(validator = false, urlPattern = "edit/{id}")
	public String edit() {
		Billboards entity = billboardsService.findById(Integer
				.valueOf(billboardsForm.id));
		Beans.copy(entity, billboardsForm).execute();
		return "edit.jsp";
	}

	@Execute(input = "new.jsp", redirect = true)
	public String insert() {
		Billboards entity = Beans
				.createAndCopy(Billboards.class, billboardsForm)
				.dateConverter("yyyy-MM-dd").execute();
		billboardsService.insert(entity);
		return "/billbords/";
	}

}