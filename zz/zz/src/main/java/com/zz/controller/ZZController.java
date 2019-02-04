package com.zz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value="/updateName", method=RequestMethod.PUT, produces="application/json")
	public List<String> updateName(@RequestParam String name){
		//return service.updateName(name);
		return new ArrayList<String>();
	}
	
	
	@RequestMapping(value="/createName", method=RequestMethod.POST, produces="application/json")
	public List<String> createName(@RequestParam String name){
		//return service.updateName(name);
		return new ArrayList<String>();
	}
	
	@RequestMapping(value="/deleteName", method=RequestMethod.DELETE, produces="application/json")
	public List<String> deleteName(@RequestParam String name){
		//return service.updateName(name);
		return new ArrayList<String>();
	}
	
	
	

}
