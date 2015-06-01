package jp.sys_link.service;

import java.util.List;

import jp.sys_link.entity.Billboards;

public class BillboardsService extends AbstractService<Billboards> {

	public Billboards findByMaxId() {
		String sql = "select * from billboards where id = (select Max(id) from billboards)";
		return jdbcManager.selectBySql(Billboards.class, sql).getSingleResult();
	}

	public List<Billboards> findBylist() {
		return jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst").orderBy("id").getResultList();
	}

	public Billboards findByShowId(String id) {
		return jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst").where("id = ?", id).getSingleResult();
	}
}