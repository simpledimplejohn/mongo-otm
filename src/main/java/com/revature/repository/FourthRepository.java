package com.revature.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.revature.model.User;

public interface FourthRepository extends MongoRepository<User, Integer> {

}
