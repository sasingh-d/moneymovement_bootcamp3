package com.myprc.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
public class Laptop implements Computer {
	
	public void compile() {
		System.out.println("Compiling with 404 bug");
	}

}
