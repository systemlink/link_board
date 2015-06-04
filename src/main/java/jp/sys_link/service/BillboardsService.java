package jp.sys_link.service;

import java.util.List;

import jp.sys_link.entity.Billboards;

import org.seasar.extension.jdbc.where.SimpleWhere;

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

	public List<Billboards> findByTitle(String title) {
		return jdbcManager.from(Billboards.class).innerJoin("user")
				.innerJoin("nameMst")
				.where(new SimpleWhere().contains("title", title))
				.orderBy("id").getResultList();
	}

	public List<Billboards> findByDate(String date) {
		return jdbcManager.from(Billboards.class).innerJoin("user")
			.innerJoin("nameMst")
			// TODO createdAtがTimestamp型なので、日付部分のみで比較するようしています。
			.where(" Date(createdAt) = ?", date )
			.orderBy("id").getResultList();
	}
}