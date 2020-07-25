package com.paypal.dictionary.service;

import java.util.List;
import java.util.Optional;

import com.paypal.dictionary.bean.Dictionary;
import com.paypal.payment.bean.UserDetails;



public interface DictionaryService {


	public Optional<Dictionary> getDictionarylInfoByName(String name);

	List<Dictionary> getAllDictionaryInfos();

	Dictionary createDictionaryInfo(Dictionary schoolInfo);

	Dictionary updateDictionaryInfo(Dictionary SchoolInfoDetails);

	void deleteDictionaryInfo(Dictionary schoolInfo);

	public Dictionary getDictionarylInfoById(Long id);
	
}
