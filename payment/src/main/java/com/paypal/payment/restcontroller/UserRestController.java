package com.paypal.payment.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.paypal.payment.bean.UserDetails;
import com.paypal.payment.dto.UserDetailsDTO;
import com.paypal.payment.service.UserService;
import com.paypal.payment.bean.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 




@RestController
@RequestMapping("/api/v1")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
    private ModelMapper modelMapper;
	
	@GetMapping("/user")
	public List<UserDetailsDTO> getAllUserDetailsInfos() {
		List<UserDetails> articles = userService.getAllUserDetailsInfos();
		
	
		return articles.stream()
        .map(this::convertToDto)
        .collect(Collectors.toList());

		
	}
	/*
	@GetMapping("/userdetails")
	public List<UserDetails> getAllUserDetailsInformation() {
		List<UserDetails> userdetails = userService.getAllUserDetailsInfos();
		
	
		return userdetails;

		
	}*/
	
	@GetMapping("/user/{id}")
	public UserDetailsDTO getAllUserDetailsByid(@PathVariable(value = "id") Long id) {
		Optional<UserDetails> optUser = userService.getUserDetailslInfoById(id);
				return convertToDtoOption(optUser);

		
	}
	
	public UserDetailsDTO convertToDto(UserDetails userDetails) {
		UserDetailsDTO SchoolInfoDTO = modelMapper.map(userDetails, UserDetailsDTO.class);
		
		return SchoolInfoDTO;
	}
	
	public UserDetailsDTO convertToDtoOption(Optional<UserDetails> optUser) {
		UserDetailsDTO opt = modelMapper.map(optUser, UserDetailsDTO.class);
		
		return opt;
	}
	
}

