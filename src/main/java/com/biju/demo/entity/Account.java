package com.biju.demo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@Table(name="account")
//@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCOUNT_ID")
	private int accountId;

	@Column(name="AVAIL_BALANCE")
	private float availBalance;

	@Temporal(TemporalType.DATE)
	@Column(name="CLOSE_DATE")
	private Date closeDate;

	@Column(name="CUST_ID")
	private int custId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_ACTIVITY_DATE")
	private Date lastActivityDate;

	@Temporal(TemporalType.DATE)
	@Column(name="OPEN_DATE")
	private Date openDate;

	@Column(name="OPEN_EMP_ID")
	private int openEmpId;

	@Column(name="PENDING_BALANCE")
	private float pendingBalance;

	@Column(name="PRODUCT_CD")
	private String productCd;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="OPEN_BRANCH_ID")
	private int openBranchId;

	//bi-directional many-to-one association to AccTransaction
	@OneToMany(mappedBy="accountId")
	@JsonManagedReference
	private List<AccTransaction> accTransactions;

	//bi-directional many-to-one association to Branch
	@ManyToOne
	@JoinColumn(name="OPEN_BRANCH_ID", insertable = false, updatable = false)
	@JsonBackReference
	private Branch branch;

	public Account() {
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public float getAvailBalance() {
		return this.availBalance;
	}

	public void setAvailBalance(float availBalance) {
		this.availBalance = availBalance;
	}

	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Date getLastActivityDate() {
		return this.lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public Date getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public int getOpenEmpId() {
		return this.openEmpId;
	}

	public void setOpenEmpId(int openEmpId) {
		this.openEmpId = openEmpId;
	}

	public float getPendingBalance() {
		return this.pendingBalance;
	}

	public void setPendingBalance(float pendingBalance) {
		this.pendingBalance = pendingBalance;
	}

	public String getProductCd() {
		return this.productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<AccTransaction> getAccTransactions() {
		return this.accTransactions;
	}

	public void setAccTransactions(List<AccTransaction> accTransactions) {
		this.accTransactions = accTransactions;
	}

	public AccTransaction addAccTransaction(AccTransaction accTransaction) {
		getAccTransactions().add(accTransaction);
		accTransaction.setAccount(this);

		return accTransaction;
	}

	public AccTransaction removeAccTransaction(AccTransaction accTransaction) {
		getAccTransactions().remove(accTransaction);
		accTransaction.setAccount(null);

		return accTransaction;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public int getOpenBranchId() {
		return openBranchId;
	}

	public void setOpenBranchId(int openBranchId) {
		this.openBranchId = openBranchId;
	}
	

}