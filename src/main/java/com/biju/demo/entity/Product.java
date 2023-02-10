package com.biju.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@Table(name="product")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRODUCT_CD")
	private String productCd;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OFFERED")
	private Date dateOffered;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_RETIRED")
	private Date dateRetired;

	@Column(name="NAME")
	private String name;
	
	@Column(name="PRODUCT_TYPE_CD")
	private String productTypeCd;

	//bi-directional many-to-one association to ProductType
	@ManyToOne
	@JoinColumn(name="PRODUCT_TYPE_CD",insertable = false, updatable = false)
	@JsonBackReference
	private ProductType productType;

	public String getProductTypeCd() {
		return productTypeCd;
	}

	public void setProductTypeCd(String productTypeCd) {
		this.productTypeCd = productTypeCd;
	}

	public Product() {
	}

	public String getProductCd() {
		return this.productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public Date getDateOffered() {
		return this.dateOffered;
	}

	public void setDateOffered(Date dateOffered) {
		this.dateOffered = dateOffered;
	}

	public Date getDateRetired() {
		return this.dateRetired;
	}

	public void setDateRetired(Date dateRetired) {
		this.dateRetired = dateRetired;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

}