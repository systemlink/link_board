package jp.sys_link.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static jp.sys_link.entity.UpfileNames.*;

/**
 * {@link Upfile}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2015/05/26 14:06:41")
public class UpfileTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Upfile.class).id(1).getSingleResult();
    }

    /**
     * billboardsとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_billboards() throws Exception {
        jdbcManager.from(Upfile.class).leftOuterJoin(billboards()).id(1).getSingleResult();
    }
}