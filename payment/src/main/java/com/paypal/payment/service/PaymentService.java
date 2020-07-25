package com.paypal.payment.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.paypal.payment.bean.TransactionDetails;
import com.paypal.payment.bean.UserDetails;



public interface PaymentService {
	List<TransactionDetails> findBytransactionTypeandtranasctionDate(String transactionType, Date tranasctionDate);
}
