package jp.sys_link.service;

import static jp.sys_link.entity.NameMstNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import org.seasar.extension.jdbc.service.S2AbstractService;

public abstract class AbstractService<ENTITY> extends S2AbstractService<ENTITY> {

	public ENTITY findById(Integer id) {
		return select().id(id).getSingleResult();
	}

    public List<ENTITY> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}