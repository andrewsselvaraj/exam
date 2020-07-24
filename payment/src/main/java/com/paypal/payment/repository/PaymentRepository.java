package com.paypal.payment.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paypal.payment.bean.Transaction;
import com.paypal.payment.bean.UserDetails;
public interface  PaymentRepository extends CrudRepository<Transaction, Long> {
	//List<Transaction> paymentTransactionByAllUser(Date dateofTransaction);
	List<Transaction> findBytransactionTypeandtranasctionDate(String transactionType,Date d);
	//List<Transaction> findTransactionDetailofUser(String userid,String transactionid);
	//void saveTransaction(Transaction transaction);
	/* Other Requirement
	 * cost of time, scablity, usablity
	 */
	  
}
