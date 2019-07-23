package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Kaushik Udavant
 *
 */
@Entity
@Table(name = "m_sub_categories")
public class SubCategories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_cat_id", length = 11)
	private int subCatId;

	@Column(name = "sub_cat_name")
	private String subCatName;

	@Column(name = "is_used")
	private int isUsed;

	@Column(name = "category_id")
	private int categoryId;

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the subCatId
	 */
	public int getSubCatId() {
		return subCatId;
	}

	/**
	 * @param subCatId the subCatId to set
	 */
	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}

	/**
	 * @return the subCatName
	 */
	public String getSubCatName() {
		return subCatName;
	}

	/**
	 * @param subCatName the subCatName to set
	 */
	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "SubCategories [subCatId=" + subCatId + ", subCatName=" + subCatName + ", isUsed=" + isUsed
				+ ", categoryId=" + categoryId + "]";
	}
}
