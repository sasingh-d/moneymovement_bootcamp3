package com.myprc.springbootjpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprc.springbootjpa.dao.Topic;
import com.myprc.springbootjpa.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;

	
	  private List<Topic> topics = new ArrayList<>(Arrays.asList( new
	  Topic("spring1", "Spring Framework", "A book of Spring framework"), new
	  Topic("java2", "J2EE", "Servlets"), new Topic("aws1", "AWS Best Practices",
	  "AWS Introduction")));
	  
	  
	 
	public List<Topic> getAllTopics() {
		//List<Topic> topics = new ArrayList<>();
		//topicRepository.findAll().forEach(t -> topics.add(t));
		// topics;
		return topics;
	}

	public Topic getTopic(String topicId) {
		return topicRepository.findById(topicId).get();
	}

	public void addTopic(Topic topic) {
		//topicRepository.save(topic);
		topics.add(topic);
	}

	public void updateTopic(String topicId, Topic topic) {
		Topic t = topicRepository.findById(topicId).get();

		t.setDescription(topic.getDescription());
		t.setName(topic.getName());

		topicRepository.save(t);
	}

	public void deleteTopic(String topicId) {
		topicRepository.deleteById(topicId);
	}
}
