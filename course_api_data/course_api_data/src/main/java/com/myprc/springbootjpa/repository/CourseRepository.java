package com.myprc.springbootjpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myprc.springbootjpa.dao.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopic(String topicId);
}
