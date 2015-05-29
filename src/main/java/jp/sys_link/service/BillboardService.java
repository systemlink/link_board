package jp.sys_link.service;

import java.util.List;

import javax.annotation.Generated;

import jp.sys_link.entity.Billboard;

/**
 * {@link Billboard}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/05/27 14:23:09")
public class BillboardService extends AbstractService<Billboard> {

	public Billboard makeBillboardItem(String id){
		return jdbcManager.from(Billboard.class).innerJoin("user")
				.innerJoin("nameMst").where("id = ?", id)
				.getSingleResult();
	}

	public List<Billboard> makeBillboardItems(){
		return jdbcManager.from(Billboard.class).innerJoin("user")
				.innerJoin("nameMst").orderBy("id").getResultList();
	}

	public Billboard makeBIllboardEntityMaxId(){
		final String SQL = "select * from billboard where id = (select max(id) from billboard)";
		return jdbcManager
				.selectBySql(Billboard.class, SQL).getSingleResult();
	}

}