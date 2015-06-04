package jp.sys_link.entity;

import javax.annotation.Generated;

import jp.sys_link.entity.BillboardsNames._BillboardsNames;
import jp.sys_link.entity.NameMstNames._NameMstNames;
import jp.sys_link.entity.UserNames._UserNames;

/**
 * 名前クラスの集約です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2015/05/26 14:06:35")
public class Names {

    /**
     * {@link Billboards}の名前クラスを返します。
     *
     * @return Billboardsの名前クラス
     */
    public static _BillboardsNames billboards() {
        return new _BillboardsNames();
    }

    /**
     * {@link NameMst}の名前クラスを返します。
     *
     * @return NameMstの名前クラス
     */
    public static _NameMstNames nameMst() {
        return new _NameMstNames();
    }

    /**
     * {@link User}の名前クラスを返します。
     *
     * @return Userの名前クラス
     */
    public static _UserNames user() {
        return new _UserNames();
    }
}