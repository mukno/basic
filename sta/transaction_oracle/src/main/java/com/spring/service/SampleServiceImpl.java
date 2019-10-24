package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mapper.sampleMapper1;
import com.spring.mapper.sampleMapper2;


@Service("sample")
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	private sampleMapper1 mapper1;
	@Autowired
	private sampleMapper2 mapper2;
	
	
	@Override
	@Transactional
	public void addData(String value) {

		mapper1.insertCol(value);
		mapper2.insertCol(value);
	}

}
