package jp.sys_link.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

/**
 * NameMstエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/05/21 11:38:22")
public class NameMst implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** codeIdプロパティ */
    @Column(length = 5, nullable = false, unique = false)
    public String codeId;

    /** codeIdNameプロパティ */
    @Column(length = 50, nullable = false, unique = false)
    public String codeIdName;

    /** codeプロパティ */
    @Column(length = 5, nullable = false, unique = false)
    public String code;

    /** nameプロパティ */
    @Lob
    @Column(length = 65535, nullable = false, unique = false)
    public String name;

    @OneToMany(mappedBy = "nameMst")
    public List<Billboard> billboardList;
}