package com.springsecurity.springSecurityy.event;

import org.springframework.context.ApplicationEvent;

import com.springsecurity.springSecurityy.entity.User;

public class RegistrationCompleteEvent  extends ApplicationEvent{

	private final User user;
	private final String applicationUrl;
	
	public RegistrationCompleteEvent(User user, String applicationUrl) {
		super(user);
		this.user = user;
		this.applicationUrl =applicationUrl;
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public String getApplicationUrl() {
		return applicationUrl;
	}

	
	
	
	
  

}
