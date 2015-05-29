package jp.sys_link.service;

import jp.sys_link.entity.Billboards;

public class BillboardsService extends AbstractService<Billboards> {

	public Billboards findByMaxId(){
		String sql = "select * from billboards where id = (select Max(id) from billboards)";
		return jdbcManager.selectBySql(Billboards.class, sql).getSingleResult();
	}
}