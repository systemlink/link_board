package jp.sys_link.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import jp.sys_link.entity.BillboardsNames._BillboardsNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link NameMst}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/05/26 14:06:35")
public class NameMstNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * codeIdのプロパティ名を返します。
     * 
     * @return codeIdのプロパティ名
     */
    public static PropertyName<String> codeId() {
        return new PropertyName<String>("codeId");
    }

    /**
     * codeIdNameのプロパティ名を返します。
     * 
     * @return codeIdNameのプロパティ名
     */
    public static PropertyName<String> codeIdName() {
        return new PropertyName<String>("codeIdName");
    }

    /**
     * codeのプロパティ名を返します。
     * 
     * @return codeのプロパティ名
     */
    public static PropertyName<String> code() {
        return new PropertyName<String>("code");
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
     * createdAtのプロパティ名を返します。
     * 
     * @return createdAtのプロパティ名
     */
    public static PropertyName<Timestamp> createdAt() {
        return new PropertyName<Timestamp>("createdAt");
    }

    /**
     * billboardsListのプロパティ名を返します。
     * 
     * @return billboardsListのプロパティ名
     */
    public static _BillboardsNames billboardsList() {
        return new _BillboardsNames("billboardsList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _NameMstNames extends PropertyName<NameMst> {

        /**
         * インスタンスを構築します。
         */
        public _NameMstNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _NameMstNames(final String name) {
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
        public _NameMstNames(final PropertyName<?> parent, final String name) {
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
         * codeIdのプロパティ名を返します。
         *
         * @return codeIdのプロパティ名
         */
        public PropertyName<String> codeId() {
            return new PropertyName<String>(this, "codeId");
        }

        /**
         * codeIdNameのプロパティ名を返します。
         *
         * @return codeIdNameのプロパティ名
         */
        public PropertyName<String> codeIdName() {
            return new PropertyName<String>(this, "codeIdName");
        }

        /**
         * codeのプロパティ名を返します。
         *
         * @return codeのプロパティ名
         */
        public PropertyName<String> code() {
            return new PropertyName<String>(this, "code");
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
         * createdAtのプロパティ名を返します。
         *
         * @return createdAtのプロパティ名
         */
        public PropertyName<Timestamp> createdAt() {
            return new PropertyName<Timestamp>(this, "createdAt");
        }

        /**
         * billboardsListのプロパティ名を返します。
         * 
         * @return billboardsListのプロパティ名
         */
        public _BillboardsNames billboardsList() {
            return new _BillboardsNames(this, "billboardsList");
        }
    }
}