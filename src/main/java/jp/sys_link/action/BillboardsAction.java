package jp.sys_link.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import jp.sys_link.entity.Billboards;
import jp.sys_link.entity.NameMst;
import jp.sys_link.entity.Upfile;
import jp.sys_link.form.BillboardsForm;
import jp.sys_link.service.BillboardsService;

import org.apache.struts.upload.FormFile;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.UploadUtil;

public class BillboardsAction {

	public List<Billboards> billboardsItems;
	public List<NameMst> nameMstItems;
	public Billboards billboardItems;
	public Upfile upfile;

	@ActionForm
	@Resource
	private BillboardsForm billboardsForm;

	@Resource
	private BillboardsService billboardsService;

	@Resource
	private JdbcManager jdbcManager;

	@Resource
	private HttpServletRequest request;

	@Resource
	private ServletContext application;

	@Execute(validator = false)
	public String index() {
		billboardsItems = jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst").orderBy("id").getResultList();
		return "top.jsp";
	}

	@Execute(validator = false)
	public String create() {
		UploadUtil.checkSizeLimit(request);
		nameMstItems = jdbcManager.from(NameMst.class).getResultList();
		return "new.jsp";
	}

	@Execute(validator = false, urlPattern = "show/{id}")
	public String show() {
		billboardItems = jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst").where("id = ?", billboardsForm.id)
				.getSingleResult();
		billboardsService.insert(billboardItems);
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

	@Execute(validator = true, input = "create", redirect = true)
	public String insert() {
		billboardsForm.userId = "1";
		Billboards entity = Beans
				.createAndCopy(Billboards.class, billboardsForm)
				.dateConverter("yyyy/MM/dd").execute();
		billboardsService.insert(entity);
		upload(billboardsForm.formFile);
		return "/billboards/";
	}

	@Execute(input = "edit.jsp", redirect = true)
	public String update() {
		Billboards entity = Beans
				.createAndCopy(Billboards.class, billboardsForm)
				.dateConverter("yyyy/MM/dd").execute();
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

	protected void upload(FormFile file){
		String path = application.getRealPath(
				"/WEB-INF/" + file.getFileName());
		UploadUtil.write(path, file);
	}
}