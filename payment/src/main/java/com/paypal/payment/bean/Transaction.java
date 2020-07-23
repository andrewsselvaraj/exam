package com.paypal.payment.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "transaction")
public class Transaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
   	private String transactionType;
    private Date tranasctionDate;
    @ManyToMany(mappedBy = "transactions", fetch = FetchType.LAZY)
    private Set<UserDetails> users = new HashSet<>();

    public Transaction() {
    }

    public Transaction(Long id,String transactionType,Date tranasctionDate) {
    	this.id =id;
        this.transactionType = transactionType;
        this.tranasctionDate = tranasctionDate;


    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Date getTranasctionDate() {
		return tranasctionDate;
	}

	public void setTranasctionDate(Date tranasctionDate) {
		this.tranasctionDate = tranasctionDate;
	}

	public Set<UserDetails> getUsers() {
		return users;
	}

	public void setUsers(Set<UserDetails> users) {
		this.users = users;
	}



    
}

