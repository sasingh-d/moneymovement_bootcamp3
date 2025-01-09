package com.myprc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.myprc.demo.service.Dev;

@SpringBootApplication
public class MyApp1Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(MyApp1Application.class, args);
		
		Dev obj = context.getBean(Dev.class);
		
		obj.build();
	}

}
