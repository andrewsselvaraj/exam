package com.paypal.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paypal.payment.bean.UserDetails;

public interface  UserRepository extends CrudRepository<UserDetails, Long> {

	//List<UserDetails> findUserDetailsDetails(String userid);
	//List<UserDetails> findAllUserDetailsDetails();
	//void saveUserPaymentTransaction(UserDetails userDetails);

	
}
