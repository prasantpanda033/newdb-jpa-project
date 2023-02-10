package com.biju.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * The persistent class for the business database table.
 * 
 */
@Entity
@Table(name="business")
@NamedQuery(name="Business.findAll", query="SELECT b FROM Business b")
public class Business implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUST_ID")
	private int custId;

	@Temporal(TemporalType.DATE)
	@Column(name="INCORP_DATE")
	private Date incorpDate;

	@Column(name="NAME")
	private String name;

	@Column(name="STATE_ID")
	private String stateId;

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Date getIncorpDate() {
		return this.incorpDate;
	}

	public void setIncorpDate(Date incorpDate) {
		this.incorpDate = incorpDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateId() {
		return this.stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

}