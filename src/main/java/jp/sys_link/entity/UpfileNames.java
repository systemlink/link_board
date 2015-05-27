package jp.sys_link.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Upfile}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/05/27 14:23:06")
public class UpfileNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * fileNameのプロパティ名を返します。
     * 
     * @return fileNameのプロパティ名
     */
    public static PropertyName<String> fileName() {
        return new PropertyName<String>("fileName");
    }

    /**
     * fileのプロパティ名を返します。
     * 
     * @return fileのプロパティ名
     */
    public static PropertyName<byte[]> file() {
        return new PropertyName<byte[]>("file");
    }

    /**
     * billboardIdのプロパティ名を返します。
     * 
     * @return billboardIdのプロパティ名
     */
    public static PropertyName<Integer> billboardId() {
        return new PropertyName<Integer>("billboardId");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UpfileNames extends PropertyName<Upfile> {

        /**
         * インスタンスを構築します。
         */
        public _UpfileNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UpfileNames(final String name) {
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
        public _UpfileNames(final PropertyName<?> parent, final String name) {
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
         * fileNameのプロパティ名を返します。
         *
         * @return fileNameのプロパティ名
         */
        public PropertyName<String> fileName() {
            return new PropertyName<String>(this, "fileName");
        }

        /**
         * fileのプロパティ名を返します。
         *
         * @return fileのプロパティ名
         */
        public PropertyName<byte[]> file() {
            return new PropertyName<byte[]>(this, "file");
        }

        /**
         * billboardIdのプロパティ名を返します。
         *
         * @return billboardIdのプロパティ名
         */
        public PropertyName<Integer> billboardId() {
            return new PropertyName<Integer>(this, "billboardId");
        }
    }
}