package jp.sys_link.action;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import jp.sys_link.entity.Billboards;
import jp.sys_link.entity.NameMst;
import jp.sys_link.form.BillboardsForm;
import jp.sys_link.service.BillboardsService;
import jp.sys_link.service.NameMstService;

import org.apache.commons.io.IOUtils;
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

	@ActionForm
	@Resource
	private BillboardsForm billboardsForm;

	@Resource
	private BillboardsService billboardsService;

	@Resource
	private NameMstService nameMstService;

	@Resource
	private JdbcManager jdbcManager;

	@Resource
	private HttpServletRequest request;

	@Resource
	private ServletContext application;

	@Execute(validator = false)
	public String index() {
		billboardsItems = billboardsService.findBylist();
		return "top.jsp";
	}

	@Execute(validator = false)
	public String create() {
		UploadUtil.checkSizeLimit(request);
		nameMstItems = nameMstService.findAll();
		return "new.jsp";
	}

	@Execute(validator = false, urlPattern = "show/{id}")
	public String show() {
		billboardItems = billboardsService.findByShowId(billboardsForm.getId());
		return "show.jsp";
	}

	@Execute(validator = false, urlPattern = "edit/{id}")
	public String edit() {
		nameMstItems = nameMstService.findAll();
		Billboards entity = billboardsService.findById(Integer
				.valueOf(billboardsForm.getId()));
		Beans.copy(entity, billboardsForm).execute();
		return "edit.jsp";
	}

	@Execute(validator = true, input = "create", redirect = true)
	public String insert() {

		// TODO ログイン機能を追加することになったら、セッションからログインIDを取得する
		billboardsForm.setUserId("1");

		// TODO アップロード処理
		upload(billboardsForm.getFormFile());

		Billboards entity = Beans
				.createAndCopy(Billboards.class, billboardsForm)
				.dateConverter("yyyy/MM/dd").execute();
		billboardsService.insert(entity);

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

	protected void upload(FormFile file) {

		// TODO アップロードしたファイル情報をデータベースに格納
		// アップロードされたかどうか、ファイルネームで判定
		if (file.getFileName() != "") {

			try {
				InputStream is = file.getInputStream();
				billboardsForm.setFile(IOUtils.toByteArray(is));
				billboardsForm.setFileName(file.getFileName());

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}