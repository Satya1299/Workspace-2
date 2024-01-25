package com.springsecurity.springSecurityy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.springSecurityy.entity.User;
import com.springsecurity.springSecurityy.event.RegistrationCompleteEvent;
import com.springsecurity.springSecurityy.model.UserModel;
import com.springsecurity.springSecurityy.service.UserService;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RegistrationCompleteEvent publisher;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserModel userModel)
	{
		User user = userService.registerUser(userModel);
		publisher.publishEvent(new RegistrationCompleteEvent(user,"url"));
		return "Sucess";
		
	}

}
