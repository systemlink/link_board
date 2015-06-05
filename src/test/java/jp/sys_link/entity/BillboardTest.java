package jp.sys_link.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static jp.sys_link.entity.BillboardNames.*;

/**
 * {@link Billboard}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2015/05/27 14:23:11")
public class BillboardTest extends S2TestCase {

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
        jdbcManager.from(Billboard.class).id(1).getSingleResult();
    }

    /**
     * userとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_user() throws Exception {
        jdbcManager.from(Billboard.class).leftOuterJoin(user()).id(1).getSingleResult();
    }
}