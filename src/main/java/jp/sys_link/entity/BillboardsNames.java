package jp.sys_link.entity;

import java.sql.Date;
import javax.annotation.Generated;
import jp.sys_link.entity.NameMstNames._NameMstNames;
import jp.sys_link.entity.UpfileNames._UpfileNames;
import jp.sys_link.entity.UserNames._UserNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Billboards}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/05/26 14:06:35")
public class BillboardsNames {

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
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Integer> userId() {
        return new PropertyName<Integer>("userId");
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
     * upfileListのプロパティ名を返します。
     * 
     * @return upfileListのプロパティ名
     */
    public static _UpfileNames upfileList() {
        return new _UpfileNames("upfileList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _BillboardsNames extends PropertyName<Billboards> {

        /**
         * インスタンスを構築します。
         */
        public _BillboardsNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _BillboardsNames(final String name) {
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
        public _BillboardsNames(final PropertyName<?> parent, final String name) {
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
         * userIdのプロパティ名を返します。
         *
         * @return userIdのプロパティ名
         */
        public PropertyName<Integer> userId() {
            return new PropertyName<Integer>(this, "userId");
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

        /**
         * upfileListのプロパティ名を返します。
         * 
         * @return upfileListのプロパティ名
         */
        public _UpfileNames upfileList() {
            return new _UpfileNames(this, "upfileList");
        }
    }
}