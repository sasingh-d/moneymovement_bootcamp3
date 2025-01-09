package com.myprc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Dev {
	
	@Autowired
	@Qualifier("laptop")
	private Computer comp;
	
	public void build() {
		comp.compile();
		System.out.println("Working on Awesome Projects.");
	}

}
