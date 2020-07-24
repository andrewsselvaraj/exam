package com.paypal.payment.service;

import java.util.List;
import java.util.Optional;

import com.paypal.payment.bean.UserDetails;



public interface UserService {
	List<UserDetails> getAllUserDetailsInfos();

	UserDetails createUserDetailsInfo(UserDetails schoolInfo);

	UserDetails updateUserDetailsInfo(UserDetails SchoolInfoDetails);

	void deleteUserDetailsInfo(UserDetails SchoolInfo);

	Optional<UserDetails> getUserDetailslInfoById(Long SchoolInfoId);
}
