package jp.sys_link.entity;

import javax.annotation.Generated;

import jp.sys_link.entity.BillboardNames._BillboardNames;
import jp.sys_link.entity.NameMstNames._NameMstNames;
import jp.sys_link.entity.UserNames._UserNames;

/**
 * 名前クラスの集約です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2015/06/02 12:01:23")
public class Names {

    /**
     * {@link Billboard}の名前クラスを返します。
     *
     * @return Billboardの名前クラス
     */
    public static _BillboardNames billboard() {
        return new _BillboardNames();
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