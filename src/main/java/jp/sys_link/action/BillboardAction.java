package jp.sys_link.action;

import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import jp.sys_link.entity.Billboard;
import jp.sys_link.entity.NameMst;
import jp.sys_link.entity.Upfile;
import jp.sys_link.form.BillboardForm;
import jp.sys_link.form.UpfileForm;
import jp.sys_link.service.BillboardService;
import jp.sys_link.service.NameMstService;
import jp.sys_link.service.UpfileService;

import org.apache.commons.io.IOUtils;
import org.apache.struts.upload.FormFile;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.UploadUtil;

public class BillboardAction {

	public List<Billboard> billboardItems;

	public Billboard billboardItem;

	public List<NameMst> nameMstItems;

	public List<Upfile> upfileItems;

	@ActionForm
	@Resource
	protected BillboardForm billboardForm;

	@ActionForm
	@Resource
	protected UpfileForm upfileForm;

	@Resource
	protected BillboardService billboardService;

	@Resource
	protected UpfileService upfileService;

	@Resource
	protected NameMstService nameMstService;

	@Resource
	protected HttpServletRequest request;

	@Resource
	protected ServletContext application;

	public JdbcManager jdbcManager;

	@Execute(validator = false)
	public String index() {
		billboardItems = billboardService.makeBillboardItems();
		return "list.jsp";
	}

	@Execute(validator = false, urlPattern = "show/{id}")
	public String show() {
		billboardItem = billboardService.makeBillboardItem(billboardForm.getId());
		/*
		 * Billboard entity =
		 * billboardService.findById(Integer.valueOf(billboardForm.id));
		 * Beans.copy(entity,
		 * billboardForm).dateConverter("yyyy-MM-dd").execute();
		 */
		return "show.jsp";
	}

	@Execute(validator = false, urlPattern = "edit/{id}")
	public String edit() {
		nameMstItems = nameMstService.findAll();
		Billboard entity = billboardService.findById(Integer
				.valueOf(billboardForm.getId()));
		Beans.copy(entity, billboardForm).dateConverter("yyyy-MM-dd").execute();
		return "edit.jsp";
	}

	@Execute(validator = false)
	public String create() {
		UploadUtil.checkSizeLimit(request);
		nameMstItems = nameMstService.findAll();
		return "create.jsp";
	}

	@Execute(validator = false, urlPattern = "delete/{id}", redirect = true)
	public String delete() {
		Billboard entity = Beans.createAndCopy(Billboard.class, billboardForm)
				.dateConverter("yyyy-MM-dd").execute();
		billboardService.delete(entity);

		upfileItems = upfileService.makeUpfileItems(entity.getId());
		for(Upfile up_entity : upfileItems){
			upfileService.delete(up_entity);
		}

		return "/billboard/";
	}

	@Execute(validator = true, input = "create", redirect = true)
	public String insert() {
		billboardForm.setUser_id("1");
		Billboard entity = Beans.createAndCopy(Billboard.class, billboardForm)
				.dateConverter("yyyy-MM-dd").execute();
		billboardService.insert(entity);
		upload(billboardForm.formFile);
		for (FormFile file : billboardForm.formFiles) {
			upload(file);
		}

		return "/billboard/";
	}

	@Execute(input = "edit.jsp", redirect = true)
	public String update() {
		billboardForm.setUser_id("1");
		Billboard entity = Beans.createAndCopy(Billboard.class, billboardForm)
				.dateConverter("yyyy-MM-dd").execute();
		billboardService.update(entity);
		return "/billboard/";
	}

	protected void upload(FormFile file) {
		/*
		 * String path = application.getRealPath("/WEB-INF/work/" +
		 * file.getFileName()); UploadUtil.write(path, file);
		 */

		if (file.getFileName() != "") {
			try {
				InputStream is = file.getInputStream();

				upfileForm.setFile(IOUtils.toByteArray(is));
				upfileForm.setFileName(file.getFileName());

				Billboard entity = billboardService.makeBIllboardEntityMaxId();

				upfileForm.setBillboardId(entity.getId().toString());
				Upfile up_entity = Beans
						.createAndCopy(Upfile.class, upfileForm)
						.dateConverter("yyyy-MM-dd").execute();
				upfileService.insert(up_entity);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}