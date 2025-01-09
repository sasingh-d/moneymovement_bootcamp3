package com.myprc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myprc.demo.service.Dev;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Dev obj = (Dev) context.getBean("dev");
		obj.build();

		obj.getComp().compile();

	}
}
