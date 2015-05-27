package jp.sys_link.entity;

import javax.annotation.Generated;
import jp.sys_link.entity.BillboardNames._BillboardNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link User}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/05/27 14:23:06")
public class UserNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * userNoのプロパティ名を返します。
     * 
     * @return userNoのプロパティ名
     */
    public static PropertyName<String> userNo() {
        return new PropertyName<String>("userNo");
    }

    /**
     * KNameのプロパティ名を返します。
     * 
     * @return KNameのプロパティ名
     */
    public static PropertyName<String> KName() {
        return new PropertyName<String>("KName");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * billboardListのプロパティ名を返します。
     * 
     * @return billboardListのプロパティ名
     */
    public static _BillboardNames billboardList() {
        return new _BillboardNames("billboardList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UserNames extends PropertyName<User> {

        /**
         * インスタンスを構築します。
         */
        public _UserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UserNames(final String name) {
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
        public _UserNames(final PropertyName<?> parent, final String name) {
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
         * userNoのプロパティ名を返します。
         *
         * @return userNoのプロパティ名
         */
        public PropertyName<String> userNo() {
            return new PropertyName<String>(this, "userNo");
        }

        /**
         * KNameのプロパティ名を返します。
         *
         * @return KNameのプロパティ名
         */
        public PropertyName<String> KName() {
            return new PropertyName<String>(this, "KName");
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * billboardListのプロパティ名を返します。
         * 
         * @return billboardListのプロパティ名
         */
        public _BillboardNames billboardList() {
            return new _BillboardNames(this, "billboardList");
        }
    }
}