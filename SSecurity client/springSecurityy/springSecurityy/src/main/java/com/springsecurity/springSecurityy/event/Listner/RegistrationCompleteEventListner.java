package com.springsecurity.springSecurityy.event.Listner;

import java.util.UUID;

import org.springframework.context.ApplicationListener;

import com.springsecurity.springSecurityy.entity.User;
import com.springsecurity.springSecurityy.event.RegistrationCompleteEvent;

public class RegistrationCompleteEventListner implements ApplicationListener<RegistrationCompleteEvent> 
{
	public void onApplicationEvent(RegistrationCompleteEvent event)
	{
		//create the Verification Token for the User with Link
		User user = event.getUser();
		String token = UUID.randomUUID().toString();
		
		//Send mail to user
	}

}
