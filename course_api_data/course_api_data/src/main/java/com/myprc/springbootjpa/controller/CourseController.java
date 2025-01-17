package com.myprc.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprc.springbootjpa.dao.Course;
import com.myprc.springbootjpa.service.CourseService;

@RestController
@RequestMapping("/topics")
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}

	@GetMapping("/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable String topicId, @PathVariable String courseId) {
		return courseService.getCourse(topicId, courseId);
	}

	@PostMapping("/topicId/courses")
	public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
		courseService.addCourse(topicId, course);
	}

	@DeleteMapping("/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable String topicId, @PathVariable String courseId) {
		courseService.deleteCourse(topicId, courseId);
	}

	@PutMapping("/{topicId}/courses")
	public void updateCourse(@PathVariable String topicId, @RequestBody Course course) {
		courseService.updateCourse(topicId, course);
	}

}
