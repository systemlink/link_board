package jp.sys_link.service;

import java.util.List;
import javax.annotation.Generated;
import jp.sys_link.entity.NameMst;

import static jp.sys_link.entity.NameMstNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link NameMst}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/05/27 14:23:09")
public class NameMstService extends AbstractService<NameMst> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public NameMst findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<NameMst> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}