package jp.sys_link.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.sys_link.entity.Billboard;
import jp.sys_link.entity.NameMst;
import jp.sys_link.form.BillboardForm;
import jp.sys_link.service.BillboardService;
import jp.sys_link.service.NameMstService;

import org.apache.commons.io.IOUtils;
import org.apache.struts.upload.FormFile;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.framework.exception.IORuntimeException;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;
import org.seasar.struts.util.UploadUtil;

public class BillboardAction {

	public List<Billboard> billboardItems;

	public Billboard billboardItem;

	public List<NameMst> nameMstItems;

	@ActionForm
	@Resource
	protected BillboardForm billboardForm;

	@Resource
	protected BillboardService billboardService;

	@Resource
	protected NameMstService nameMstService;

	@Resource
	protected HttpServletRequest request;

	@Resource
	protected HttpServletResponse response;

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

		return "/billboard/";
	}

	@Execute(validator = true, input = "create", redirect = true)
	public String insert() {
		billboardForm.setUser_id("1");
		upload(billboardForm.formFile);
		Billboard entity = Beans.createAndCopy(Billboard.class, billboardForm)
				.dateConverter("yyyy-MM-dd").execute();
		billboardService.insert(entity);

		return "/billboard/";
	}

	@Execute(validator = true,input = "edit/{id}", redirect = true)
	public String update() {
		billboardForm.setUser_id("1");
		Billboard entity = Beans.createAndCopy(Billboard.class, billboardForm)
				.dateConverter("yyyy-MM-dd").execute();
		billboardService.update(entity);
		return "/billboard/";
	}

	private void upload(FormFile file) {
		/*
		 * String path = application.getRealPath("/WEB-INF/work/" +
		 * file.getFileName()); UploadUtil.write(path, file);
		 */

		if (file.getFileName() != "") {

			try {
				InputStream is = file.getInputStream();

				billboardForm.setFile(IOUtils.toByteArray(is));
				billboardForm.setFileName(file.getFileName());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Execute(input = "show.jsp",validator = false, urlPattern = "download/{id}")
	public String download(){
		try{
			billboardItem = billboardService.makeBillboardItem(billboardForm.getId());
			ResponseUtil.download(new String(billboardItem.getFileName().getBytes("Shift_JIS"), "ISO-8859-1"),
					billboardItem.getFile());
		}catch(IOException e){
			throw new IORuntimeException(e);
		}
		return null;
	}

	@Execute(input = "index",validator = true)
	public String searchTitle(){
		billboardItems = billboardService.SearchTitle(billboardForm.getTitle());
		return "list.jsp";
	}

	@Execute(input = "index",validator = true)
	public String searchDate(){
		billboardItems = billboardService.SearchDate(billboardForm.getCreatedAt());
		return "list.jsp";
	}
}