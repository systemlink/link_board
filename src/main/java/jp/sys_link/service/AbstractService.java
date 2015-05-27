package jp.sys_link.service;

import static jp.sys_link.entity.BillboardNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.service.S2AbstractService;

/**
 * サービスの抽象クラスです。
 *
 * @param <ENTITY>
 *            エンティティの型
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.AbstServiceModelFactoryImpl"}, date = "2015/05/27 14:23:09")
public abstract class AbstractService<ENTITY> extends S2AbstractService<ENTITY> {

	public ENTITY findById(Integer id) {
        return select().id(id).getSingleResult();
    }

	public List<ENTITY> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}