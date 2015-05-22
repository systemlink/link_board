package jp.sys_link.action;

import java.util.List;

import javax.annotation.Resource;

import jp.sys_link.entity.Billboards;
import jp.sys_link.entity.NameMst;
import jp.sys_link.form.BillboardsForm;
import jp.sys_link.service.BillboardsService;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class BillboardsAction {

	public List<Billboards> billboardsItems;
	public List<NameMst> nameMstItems;

	@ActionForm
	@Resource
	private BillboardsForm billboardsForm;

	@Resource
	private BillboardsService billboardsService;

	@Resource
	private JdbcManager jdbcManager;

	@Execute(validator = false)
	public String index() {
		billboardsItems = jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst").getResultList();
		return "top.jsp";
	}

	@Execute(validator = false)
	public String create() {
		return "new.jsp";
	}

	@Execute(validator = false, urlPattern = "show/{id}")
	public String show() {
		billboardsItems = jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst").where("id = ?", billboardsForm.id)
				.getResultList();
		return "show.jsp";
	}

	@Execute(validator = false, urlPattern = "edit/{id}")
	public String edit() {
		nameMstItems = jdbcManager.from(NameMst.class).getResultList();
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
		entity.userId = 2;
		billboardsService.insert(entity);
		return "/billboards/";
	}

	@Execute(input = "edit.jsp", redirect = true)
	public String update() {
		Billboards entity = Beans
				.createAndCopy(Billboards.class, billboardsForm)
				.dateConverter("yyyy-MM-dd").execute();
		billboardsService.update(entity);
		return "/billboards/";
	}

	@Execute(input = "edit.jsp", redirect = true)
	public String delete() {
		Billboards entity = Beans
				.createAndCopy(Billboards.class, billboardsForm)
				.dateConverter("yyyy-MM-dd").execute();
		billboardsService.delete(entity);
		return "/billboards/";
	}

}