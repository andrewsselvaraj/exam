package com.paypal.payment.dto;

import java.util.Date;

public class TransactionDTO {

    public Long getId() {
		return id;
	}
	public TransactionDTO() {
		super();
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
	private Long id; 
   	private String transactionType;
    private Date tranasctionDate;
	
	
}
