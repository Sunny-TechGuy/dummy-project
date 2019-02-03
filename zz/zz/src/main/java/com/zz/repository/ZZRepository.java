package com.zz.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ZZRepository {

	public List<String> zzNames(){
		
		List<String> names = new ArrayList<String>();
		
		names.add("A");
		names.add("B");
		names.add("C");
		
		return names;
	}
}


