package jp.sys_link.service;

import java.util.List;

import javax.annotation.Generated;

import jp.sys_link.entity.Upfile;

/**
 * {@link Upfile}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/05/27 14:23:09")
public class UpfileService extends AbstractService<Upfile> {

	public List<Upfile> makeUpfileItems(Integer id){
		return jdbcManager.from(Upfile.class)
				.where("billboardId = ?", id).getResultList();
	}

}