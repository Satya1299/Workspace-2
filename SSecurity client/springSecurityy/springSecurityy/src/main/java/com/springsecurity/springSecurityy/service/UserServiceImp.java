package com.springsecurity.springSecurityy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecurity.springSecurityy.entity.User;
import com.springsecurity.springSecurityy.model.UserModel;
import com.springsecurity.springSecurityy.repository.userRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private userRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User registerUser(UserModel userModel) {
		User user = new User();
		user.setEmail(userModel.getEmail());
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setEmail(userModel.getEmail());
		user.setRole("USER");
		user.setPassword(passwordEncoder.encode(userModel.getPassword()));
		userRepository.save(user);
		return user;
	}

}
