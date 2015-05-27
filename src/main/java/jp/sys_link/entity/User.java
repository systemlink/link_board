package jp.sys_link.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Userエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/05/21 11:38:22")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** userNoプロパティ */
    @Column(length = 5, nullable = false, unique = false)
    public String userNo;

    /** KNameプロパティ */
    @Column(length = 40, nullable = false, unique = false)
    public String KName;

    /** nameプロパティ */
    @Column(length = 40, nullable = false, unique = false)
    public String name;

    /** billboardList関連プロパティ */
    @OneToMany(mappedBy = "user")
    public List<Billboard> billboardList;
}