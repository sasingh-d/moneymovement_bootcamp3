package com.myprc.springbootjpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprc.springbootjpa.dao.Course;
import com.myprc.springbootjpa.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository; 
	
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopic(topicId);
		return courses;
	}
	
	public Course getCourse(String topicId, String courseId) {
		return courseRepository.findById(courseId).get();
	}
	
	public void addCourse(String topicId, Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(String topicId, Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String topicId, String courseId) {
		courseRepository.deleteById(courseId);
	}
}
