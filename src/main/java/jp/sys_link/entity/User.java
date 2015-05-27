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
    private Integer id;

    /** userNoプロパティ */
    @Column(length = 5, nullable = false, unique = false)
    private String userNo;

    /** KNameプロパティ */
    @Column(length = 40, nullable = false, unique = false)
    private String KName;

    /** nameプロパティ */
    @Column(length = 40, nullable = false, unique = false)
    private String name;

    /** billboardList関連プロパティ */
    @OneToMany(mappedBy = "user")
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
	 * userNoプロパティを取得します。
	 * @return userNoプロパティ
	 */
	public String getUserNo() {
	    return userNo;
	}

	/**
	 * userNoプロパティを設定します。
	 * @param userNo userNoプロパティ
	 */
	public void setUserNo(String userNo) {
	    this.userNo = userNo;
	}

	/**
	 * KNameプロパティを取得します。
	 * @return KNameプロパティ
	 */
	public String getKName() {
	    return KName;
	}

	/**
	 * KNameプロパティを設定します。
	 * @param KName KNameプロパティ
	 */
	public void setKName(String KName) {
	    this.KName = KName;
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
	 * billboardList関連プロパティを取得します。
	 * @return billboardList関連プロパティ
	 */
	public List<Billboard> getBillboardList() {
	    return billboardList;
	}

	/**
	 * billboardList関連プロパティを設定します。
	 * @param billboardList billboardList関連プロパティ
	 */
	public void setBillboardList(List<Billboard> billboardList) {
	    this.billboardList = billboardList;
	}
}