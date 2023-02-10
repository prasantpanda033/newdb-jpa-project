package com.biju.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="customer")
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS")
	private String address;

	@Column(name="CITY")
	private String city;

	@Id
	@Column(name="CUST_ID")
	private int custId;

	@Column(name="CUST_TYPE_CD")
	private String custTypeCd;

	@Column(name="FED_ID")
	private String fedId;

	@Column(name="POSTAL_CODE")
	private String postalCode;

	@Column(name="STATE")
	private String state;

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustTypeCd() {
		return this.custTypeCd;
	}

	public void setCustTypeCd(String custTypeCd) {
		this.custTypeCd = custTypeCd;
	}

	public String getFedId() {
		return this.fedId;
	}

	public void setFedId(String fedId) {
		this.fedId = fedId;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}