package com.zz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zz.repository.ZZRepository;

@Service
public class ZZService {

	@Autowired
	ZZRepository repository;
	
	public List<String> zzNames(){
		return repository.zzNames();
	}
}
