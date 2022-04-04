package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.repository.FourthRepository;

@RestController
public class FourthController {
	
	@Autowired
	FourthRepository repository;
	
	
	@PostMapping("/placeOrderNow")
	public String placeOrder(@RequestBody User user) {
		repository.save(user);
		return "Order Placed sucessfully for: " +user.getName();
		
	}
	
	@GetMapping("/getUserByName/{}")
	public List<User> getUserByName(@PathVariable String name) {
		return repository.findByName(name);
	}
	

}
