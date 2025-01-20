package com.myprc.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprc.microservice.config.DBSetting;

@RestController
public class GreetingController {
	
	@Value("${my.greeting : default value}")
	private String greetingMessage;
	
	@Value("my.static.message")
	private String staticMessage;
	
	@Value("${my.list.values}")
	private List<String> messageList;
	
	@Autowired
	private DBSetting dbSetting;
	
	@GetMapping("/greetings")
	public String greetings() {
		return greetingMessage + " " + staticMessage + messageList;
	}

}
