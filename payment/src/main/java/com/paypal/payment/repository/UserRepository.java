package com.paypal.payment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.paypal.payment.bean.UserDetails;

public interface  UserRepository extends JpaRepository<UserDetails, Long> {


	
}
