package com.shb;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	public User getUserByName(String name) {
		User user = new User();
		user.setId(1);
		user.setName(name);
		user.setPwd("12345");
		return user;
	}
}
