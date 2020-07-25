package com.paypal.dictionary.rest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.paypal.payment.bean.UserDetails;
import com.paypal.payment.dto.UserDetailsDTO;
import com.paypal.payment.service.PaymentService;
import com.paypal.payment.service.UserService;
import com.paypal.dictionary.bean.Dictionary;
import com.paypal.dictionary.service.DictionaryService;
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
public class DictornaryRestController {
	
	@Autowired
	private DictionaryService dictionaryService;
	
	@GetMapping("/dictionary/{name}")
	public Optional<Dictionary> findBytransactionType(@PathVariable(value = "type") String name) {
		

		Optional<Dictionary> dic = dictionaryService.getDictionarylInfoByName(name);
	
				return dic;

		
	
	}
	
	@DeleteMapping("/dictionary/{id}")
	public void deleteDictionary(@PathVariable(value = "id") Long id) {
		Dictionary  d= dictionaryService.getDictionarylInfoById(id);
		
		 dictionaryService.deleteDictionaryInfo(d);
	
		
		
	
	}
	
	@PostMapping("/dictionary")
	public Dictionary createSchool(@Valid @RequestBody Dictionary schoolInfo) {
		return dictionaryService.createDictionaryInfo(schoolInfo);
	}

		
}

