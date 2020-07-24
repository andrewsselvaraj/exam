package com.paypal.dictionary.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.dictionary.bean.Dictionary;
import com.paypal.dictionary.repository.DictionaryRepository;
import com.paypal.dictionary.service.DictionaryService;
 
import com.paypal.payment.repository.UserRepository;
import com.paypal.payment.service.UserService;
@Service
public class DictionaryServiceImpl implements DictionaryService{

	@Autowired
	DictionaryRepository dictionaryRepository;

	@Override
	public Optional<Dictionary> getDictionarylInfoByName(String name) {
		// TODO Auto-generated method stub
		return this.dictionaryRepository.getDictionarylInfoByName(name);
	}
	
	@Override
	public List<Dictionary> getAllDictionaryInfos() {
		// TODO Auto-generated method stub
		return this.dictionaryRepository.findAll();
	}

	@Override
	public Dictionary createDictionaryInfo(Dictionary d) {
		// TODO Auto-generated method stub
		return this.dictionaryRepository.save(d);
	}

	@Override
	public Dictionary updateDictionaryInfo(Dictionary d) {
		// TODO Auto-generated method stub
		return this.dictionaryRepository.save(d);
	}

	@Override
	public void deleteDictionaryInfo(Dictionary d) {
		 this.dictionaryRepository.save(d);
		
	}
	


	

}
