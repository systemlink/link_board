package jp.sys_link.service;

import jp.sys_link.entity.Billboards;

public class BillboardsService extends AbstractService<Billboards> {

    public Billboards findById(Integer id) {
        return select().id(id).getSingleResult();
    }
}