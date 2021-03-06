package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.repository.FourthRepository;

@RestController
@RequestMapping("/orderService")
public class FourthController {
	
	@Autowired
	FourthRepository repository;
	
	@GetMapping("/")
	public List<User> getAllUsers() {
		return repository.findAll();
	}
	
	
	@PostMapping("/placeOrderNow")
	public String placeOrder(@RequestBody User user) {
		repository.save(user);
		return "Order Placed sucessfully for: " +user.getName();
		
	}
	
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable String name) {
		return repository.findByName(name);
	}
	
	@GetMapping("/getUserByAddress/{city}")
	public List<User> getUserByAddress(@PathVariable String city) {
		return repository.findByCity(city);
	}

	

}
