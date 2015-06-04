package jp.sys_link.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static jp.sys_link.entity.NameMstNames.*;

/**
 * {@link NameMst}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2015/05/22 16:52:30")
public class NameMstTest extends S2TestCase {

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
        jdbcManager.from(NameMst.class).id(1).getSingleResult();
    }

    /**
     * billboardsListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_billboardsList() throws Exception {
        jdbcManager.from(NameMst.class).leftOuterJoin(billboardsList()).id(1).getSingleResult();
    }
}