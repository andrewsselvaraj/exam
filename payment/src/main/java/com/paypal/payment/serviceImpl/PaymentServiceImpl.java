package com.paypal.payment.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.payment.bean.Transaction;
import com.paypal.payment.bean.UserDetails;
import com.paypal.payment.repository.PaymentRepository;
import com.paypal.payment.repository.UserRepository;
import com.paypal.payment.service.PaymentService;
import com.paypal.payment.service.UserService;
@Service
public class PaymentServiceImpl implements PaymentService{

	
	@Autowired
	PaymentRepository paymentRepository;


	
	
	@Override
	public List<Transaction> findBytransactionType(String transactionType, Date tranasctionDate) {
		// TODO Auto-generated method stub
		return this.paymentRepository.findBytransactionTypeandtranasctionDate(transactionType,tranasctionDate);
	}


	
	
	
}
