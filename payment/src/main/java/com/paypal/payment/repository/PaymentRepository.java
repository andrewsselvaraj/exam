package com.paypal.payment.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paypal.payment.bean.TransactionDetails;
import com.paypal.payment.bean.UserDetails;
public interface  PaymentRepository extends CrudRepository<TransactionDetails, Long> {
	//List<Transaction> paymentTransactionByAllUser(Date dateofTransaction);
	List<TransactionDetails> findBytransactionTypeandtranasctionDate(String transactiontype,Date transactiondate);
	//List<Transaction> findTransactionDetailofUser(String userid,String transactionid);
	//void saveTransaction(Transaction transaction);
	/* Other Requirement
	 * cost of time, scablity, usablity
	 */
	  
}
