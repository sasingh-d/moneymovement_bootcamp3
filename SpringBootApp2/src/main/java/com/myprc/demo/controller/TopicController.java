package com.myprc.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprc.demo.dao.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("spring1","Spring Framework","A book of Spring framework"),
				new Topic("java2","J2EE","Servlets"));
	}

}
