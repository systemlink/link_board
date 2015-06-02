package jp.sys_link.entity;

import java.sql.Date;

import javax.annotation.Generated;

import jp.sys_link.entity.NameMstNames._NameMstNames;
import jp.sys_link.entity.UserNames._UserNames;

import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Billboard}のプロパティ名の集合です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/06/02 12:01:23")
public class BillboardNames {

    /**
     * idのプロパティ名を返します。
     *
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * titleのプロパティ名を返します。
     *
     * @return titleのプロパティ名
     */
    public static PropertyName<String> title() {
        return new PropertyName<String>("title");
    }

    /**
     * noteのプロパティ名を返します。
     *
     * @return noteのプロパティ名
     */
    public static PropertyName<String> note() {
        return new PropertyName<String>("note");
    }

    /**
     * billboardGroupIdのプロパティ名を返します。
     *
     * @return billboardGroupIdのプロパティ名
     */
    public static PropertyName<Integer> billboardGroupId() {
        return new PropertyName<Integer>("billboardGroupId");
    }

    /**
     * user_idのプロパティ名を返します。
     *
     * @return user_idのプロパティ名
     */
    public static PropertyName<Integer> user_id() {
        return new PropertyName<Integer>("user_id");
    }

    /**
     * createdAtのプロパティ名を返します。
     *
     * @return createdAtのプロパティ名
     */
    public static PropertyName<Date> createdAt() {
        return new PropertyName<Date>("createdAt");
    }

    /**
     * userのプロパティ名を返します。
     *
     * @return userのプロパティ名
     */
    public static _UserNames user() {
        return new _UserNames("user");
    }

    /**
     * nameMstのプロパティ名を返します。
     *
     * @return nameMstのプロパティ名
     */
    public static _NameMstNames nameMst() {
        return new _NameMstNames("nameMst");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _BillboardNames extends PropertyName<Billboard> {

        /**
         * インスタンスを構築します。
         */
        public _BillboardNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _BillboardNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         *
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _BillboardNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * titleのプロパティ名を返します。
         *
         * @return titleのプロパティ名
         */
        public PropertyName<String> title() {
            return new PropertyName<String>(this, "title");
        }

        /**
         * noteのプロパティ名を返します。
         *
         * @return noteのプロパティ名
         */
        public PropertyName<String> note() {
            return new PropertyName<String>(this, "note");
        }

        /**
         * billboardGroupIdのプロパティ名を返します。
         *
         * @return billboardGroupIdのプロパティ名
         */
        public PropertyName<Integer> billboardGroupId() {
            return new PropertyName<Integer>(this, "billboardGroupId");
        }

        /**
         * user_idのプロパティ名を返します。
         *
         * @return user_idのプロパティ名
         */
        public PropertyName<Integer> user_id() {
            return new PropertyName<Integer>(this, "user_id");
        }

        /**
         * createdAtのプロパティ名を返します。
         *
         * @return createdAtのプロパティ名
         */
        public PropertyName<Date> createdAt() {
            return new PropertyName<Date>(this, "createdAt");
        }

        /**
         * userのプロパティ名を返します。
         *
         * @return userのプロパティ名
         */
        public _UserNames user() {
            return new _UserNames(this, "user");
        }

        /**
         * nameMstのプロパティ名を返します。
         *
         * @return nameMstのプロパティ名
         */
        public _NameMstNames nameMst() {
            return new _NameMstNames(this, "nameMst");
        }
    }
}