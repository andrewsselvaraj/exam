package com.paypal.payment.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.paypal.payment.bean.Transaction;

public class UserDetailsDTO {

    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public UserDetailsDTO() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public Set<Transaction> getTransactions() {
		return transactions;
	}


	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}


	private Long id;

    private String name;
    private int accountnumber;


	private String userID;
    

    private Set<Transaction> transactions = new HashSet<>();

}
