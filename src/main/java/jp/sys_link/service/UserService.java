package jp.sys_link.service;

import java.util.List;
import javax.annotation.Generated;
import jp.sys_link.entity.User;

import static jp.sys_link.entity.UserNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link User}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/05/21 16:15:47")
public class UserService extends AbstractService<User> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public User findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<User> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}