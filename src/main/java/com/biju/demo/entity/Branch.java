package com.biju.demo.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * The persistent class for the branch database table.
 * 
 */
@Entity
@Table(name="branch")
@NamedQuery(name="Branch.findAll", query="SELECT b FROM Branch b")
public class Branch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BRANCH_ID")
	private int branchId;

	@Column(name="ADDRESS")	
	private String address;
	
	@Column(name="CITY")
	private String city;

	@Column(name="NAME")
	private String name;

	@Column(name="STATE")
	private String state;

	@Column(name="ZIP_CODE")
	private String zipCode;

	//bi-directional many-to-one association to AccTransaction
	@OneToMany(mappedBy="branch")
	@JsonManagedReference
	private List<AccTransaction> accTransactions;

	//bi-directional many-to-one association to Account
	@OneToMany(mappedBy="branch")
	@JsonManagedReference
	private List<Account> accounts;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="branch")
	@JsonManagedReference
	private List<Employee> employees;

	public Branch() {
	}

	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<AccTransaction> getAccTransactions() {
		return this.accTransactions;
	}

	public void setAccTransactions(List<AccTransaction> accTransactions) {
		this.accTransactions = accTransactions;
	}

	public AccTransaction addAccTransaction(AccTransaction accTransaction) {
		getAccTransactions().add(accTransaction);
		accTransaction.setBranch(this);

		return accTransaction;
	}

	public AccTransaction removeAccTransaction(AccTransaction accTransaction) {
		getAccTransactions().remove(accTransaction);
		accTransaction.setBranch(null);

		return accTransaction;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Account addAccount(Account account) {
		getAccounts().add(account);
		account.setBranch(this);

		return account;
	}

	public Account removeAccount(Account account) {
		getAccounts().remove(account);
		account.setBranch(null);

		return account;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setBranch(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setBranch(null);

		return employee;
	}

}