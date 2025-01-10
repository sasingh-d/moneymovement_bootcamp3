package com.myprc.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myprc.demo.dao.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring1", "Spring Framework", "A book of Spring framework"),
			new Topic("java2", "J2EE", "Servlets"), new Topic("aws1", "AWS Best Practices", "AWS Introduction")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String topicId) {
		return topics.stream().filter(topic -> topic.getId().equals(topicId)).findAny().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String topicId, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(topicId)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String topicId) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(topicId)) {
				topics.remove(i);
			}
		}

	}
}
