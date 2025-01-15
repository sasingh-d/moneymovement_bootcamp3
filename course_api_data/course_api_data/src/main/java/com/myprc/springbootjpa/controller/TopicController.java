package com.myprc.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myprc.springbootjpa.dao.Topic;
import com.myprc.springbootjpa.service.TopicService;

public class TopicController {

	@Autowired
	TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String topicId) {
		return topicService.getTopic(topicId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topic")
	public void addTopic(Topic topic) {
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String topicId) {
		topicService.deleteTopic(topicId);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(String topicId, Topic topic) {
		topicService.updateTopic(topicId, topic);
	}

}
