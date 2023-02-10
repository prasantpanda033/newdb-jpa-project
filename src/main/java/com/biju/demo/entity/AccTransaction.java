package com.biju.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the acc_transaction database table.
 * 
 */
@Entity
@Table(name="acc_transaction")
@NamedQuery(name="AccTransaction.findAll", query="SELECT a FROM AccTransaction a")
@IdClass(AccTransactionPK.class)
public class AccTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TXN_ID")
	private long txnId;
	
	@Id
	@Column(name="ACCOUNT_ID")
	private int accountId;

	@Column(name="AMOUNT")
	private float amount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FUNDS_AVAIL_DATE")
	private Date fundsAvailDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TXN_DATE")
	private Date txnDate;

	@Column(name="TXN_TYPE_CD")
	private String txnTypeCd;
	
	
	
	@Column(name="EXECUTION_BRANCH_ID")
	private Integer executionBranchId;
	
	@Column(name="TELLER_EMP_ID")
	private Integer tellerEmpId;

	

	public Integer getExecutionBranchId() {
		return executionBranchId;
	}

	public void setExecutionBranchId(Integer executionBranchId) {
		this.executionBranchId = executionBranchId;
	}
	
	

	

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="ACCOUNT_ID", insertable = false, updatable = false)
	@JsonBackReference
	private Account account;

	//bi-directional many-to-one association to Branch
	@ManyToOne
	@JoinColumn(name="EXECUTION_BRANCH_ID", nullable = true, insertable = false, updatable = false)
	@JsonBackReference
	private Branch branch;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="TELLER_EMP_ID", insertable = false, updatable = false)
	@JsonBackReference
	private Employee employee;

	public AccTransaction() {
	}

	public long getTxnId() {
		return this.txnId;
	}

	public void setTxnId(long txnId) {
		this.txnId = txnId;
	}

	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getFundsAvailDate() {
		return this.fundsAvailDate;
	}

	public void setFundsAvailDate(Date fundsAvailDate) {
		this.fundsAvailDate = fundsAvailDate;
	}

	public Date getTxnDate() {
		return this.txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public String getTxnTypeCd() {
		return this.txnTypeCd;
	}

	public void setTxnTypeCd(String txnTypeCd) {
		this.txnTypeCd = txnTypeCd;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Integer getTellerEmpId() {
		return tellerEmpId;
	}

	public void setTellerEmpId(Integer tellerEmpId) {
		this.tellerEmpId = tellerEmpId;
	}
	
	

}