package com.paypal.payment.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.payment.bean.UserDetails;
import com.paypal.payment.repository.UserRepository;
import com.paypal.payment.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<UserDetails> getAllUserDetailsInfos() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

	@Override
	public UserDetails createUserDetailsInfo(UserDetails schoolInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails updateUserDetailsInfo(UserDetails SchoolInfoDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserDetailsInfo(UserDetails SchoolInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<UserDetails> getUserDetailslInfoById(Long id) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(id);
	}

}
