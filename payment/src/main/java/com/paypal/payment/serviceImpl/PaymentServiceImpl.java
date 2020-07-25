package com.paypal.payment.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paypal.payment.bean.TransactionDetails;
import com.paypal.payment.bean.UserDetails;
import com.paypal.payment.repository.PaymentRepository;
import com.paypal.payment.repository.UserRepository;
import com.paypal.payment.service.PaymentService;
import com.paypal.payment.service.UserService;
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{

	
	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public List<TransactionDetails> findBytransactionTypeandtranasctionDate(String transactionType,
			Date tranasctionDate) {
		return this.paymentRepository.findBytransactionTypeandtranasctionDate(transactionType,tranasctionDate);
	}

	


	
	


	
	
	
}
