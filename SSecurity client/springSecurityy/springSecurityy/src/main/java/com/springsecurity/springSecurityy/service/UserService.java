package com.springsecurity.springSecurityy.service;

import com.springsecurity.springSecurityy.entity.User;
import com.springsecurity.springSecurityy.model.UserModel;

public interface UserService {

	User registerUser(UserModel userModel);

}
