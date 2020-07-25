package com.paypal.payment.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "transaction")
public class TransactionDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String transactiontype;
	private Date tranasctiondate;
	
	@ManyToMany(mappedBy = "transactions", fetch = FetchType.LAZY)
	private Set<UserDetails> users = new HashSet<>();

	public TransactionDetails() {
	}

	public TransactionDetails(Long id, String transactionType, Date tranasctionDate) {
		this.id = id;
		this.transactiontype = transactionType;
		this.tranasctiondate = tranasctionDate;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTransactiontype() {
		return transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}


	public Set<UserDetails> getUsers() {
		return users;
	}

	public void setUsers(Set<UserDetails> users) {
		this.users = users;
	}
	public Date getTranasctiondate() {
		return tranasctiondate;
	}

	public void setTranasctiondate(Date tranasctiondate) {
		this.tranasctiondate = tranasctiondate;
	}
}
