package jp.sys_link.service;

import java.util.List;
import javax.annotation.Generated;
import jp.sys_link.entity.Upfile;

import static jp.sys_link.entity.UpfileNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Upfile}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/05/26 14:06:39")
public class UpfileService extends AbstractService<Upfile> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Upfile findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Upfile> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}