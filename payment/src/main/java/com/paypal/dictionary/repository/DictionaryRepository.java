package com.paypal.dictionary.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.paypal.dictionary.bean.Dictionary;
import com.paypal.payment.bean.Transaction;
import com.paypal.payment.bean.UserDetails;

public interface  DictionaryRepository extends JpaRepository<Dictionary, Long> {

	//List<Dictionary> findBytransactionTypeandtranasctionDate(String transactionType,Date d);

	Optional<Dictionary> getDictionarylInfoByName(String name);
	
}
