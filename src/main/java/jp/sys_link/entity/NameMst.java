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
    private Integer id;

    /** codeIdプロパティ */
    @Column(length = 5, nullable = false, unique = false)
    private String codeId;

    /** codeIdNameプロパティ */
    @Column(length = 50, nullable = false, unique = false)
    private String codeIdName;

    /** codeプロパティ */
    @Column(length = 5, nullable = false, unique = false)
    private String code;

    /** nameプロパティ */
    @Lob
    @Column(length = 65535, nullable = false, unique = false)
    private String name;

    @OneToMany(mappedBy = "nameMst")
    private List<Billboard> billboardList;

	/**
	 * idプロパティを取得します。
	 * @return idプロパティ
	 */
	public Integer getId() {
	    return id;
	}

	/**
	 * idプロパティを設定します。
	 * @param id idプロパティ
	 */
	public void setId(Integer id) {
	    this.id = id;
	}

	/**
	 * codeIdプロパティを取得します。
	 * @return codeIdプロパティ
	 */
	public String getCodeId() {
	    return codeId;
	}

	/**
	 * codeIdプロパティを設定します。
	 * @param codeId codeIdプロパティ
	 */
	public void setCodeId(String codeId) {
	    this.codeId = codeId;
	}

	/**
	 * codeIdNameプロパティを取得します。
	 * @return codeIdNameプロパティ
	 */
	public String getCodeIdName() {
	    return codeIdName;
	}

	/**
	 * codeIdNameプロパティを設定します。
	 * @param codeIdName codeIdNameプロパティ
	 */
	public void setCodeIdName(String codeIdName) {
	    this.codeIdName = codeIdName;
	}

	/**
	 * codeプロパティを取得します。
	 * @return codeプロパティ
	 */
	public String getCode() {
	    return code;
	}

	/**
	 * codeプロパティを設定します。
	 * @param code codeプロパティ
	 */
	public void setCode(String code) {
	    this.code = code;
	}

	/**
	 * nameプロパティを取得します。
	 * @return nameプロパティ
	 */
	public String getName() {
	    return name;
	}

	/**
	 * nameプロパティを設定します。
	 * @param name nameプロパティ
	 */
	public void setName(String name) {
	    this.name = name;
	}

	/**
	 * billboardListを取得します。
	 * @return billboardList
	 */
	public List<Billboard> getBillboardList() {
	    return billboardList;
	}

	/**
	 * billboardListを設定します。
	 * @param billboardList billboardList
	 */
	public void setBillboardList(List<Billboard> billboardList) {
	    this.billboardList = billboardList;
	}
}