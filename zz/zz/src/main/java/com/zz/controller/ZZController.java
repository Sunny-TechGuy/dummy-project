package com.zz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zz.service.ZZService;

@RestController
public class ZZController {
	
	@Autowired
	ZZService service;
	
	@RequestMapping(value="/ZZDetails", method=RequestMethod.GET, produces="application/json")
	public List<String> zzNames(){
		return service.zzNames();
	}

}
