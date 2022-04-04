package com.revature.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.revature.model.User;

public interface FourthRepository extends MongoRepository<User, Integer> {

	List<User> findByName(String name);
	
	// run time parapmeter
	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);

}
