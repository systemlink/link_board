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
import jp.sys_link.entity.Upfile;
import jp.sys_link.form.BillboardsForm;
import jp.sys_link.form.UpfileForm;
import jp.sys_link.service.BillboardsService;
import jp.sys_link.service.NameMstService;
import jp.sys_link.service.UpfileService;

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
	public List<Upfile> upfileItems;

	@ActionForm
	@Resource
	private BillboardsForm billboardsForm;

	@ActionForm
	@Resource
	private UpfileForm upfileForm;

	@Resource
	private BillboardsService billboardsService;

	@Resource
	private UpfileService upfileService;

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
		billboardsItems = jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst").orderBy("id").getResultList();
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
		billboardItems = jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst").where("id = ?", billboardsForm.getId())
				.getSingleResult();
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

		Billboards entity = Beans
				.createAndCopy(Billboards.class, billboardsForm)
				.dateConverter("yyyy/MM/dd").execute();
		billboardsService.insert(entity);

		// TODO アップロード処理
		upload(billboardsForm.getFormFile());

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

		// TODO 上記で削除したIDが持っていたファイル情報の削除
		upfileItems = jdbcManager.from(Upfile.class)
				.where("billboardId = ?", entity.getId()).getResultList();
		for (Upfile upfileEntity : upfileItems)
			upfileService.delete(upfileEntity);

		return "/billboards/";
	}

	protected void upload(FormFile file) {
		/**
		 * アップロードできているかの確認。 String path = application.getRealPath("/WEB-INF/" +
		 * file.getFileName()); UploadUtil.write(path, file);
		 */

		// TODO アップロードしたファイル情報をデータベースに格納
		//アップロードされたかどうか、ファイルネームで判定
		if (file.getFileName() != "") {

			Billboards entity = billboardsService.findByMaxId();
			try {
				InputStream is = file.getInputStream();
				upfileForm.setFile(IOUtils.toByteArray(is));
				upfileForm.setBillboardId(entity.getId().toString());
				upfileForm.setFileName(file.getFileName());

				Upfile upfile = Beans.createAndCopy(Upfile.class, upfileForm)
						.execute();
				upfileService.insert(upfile);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}