package com.myprc.springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myprc.springbootjpa.dao.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {

}
