package com.shb;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	public User getUserById(String id) {
		User user = new User();
		user.setId(id);
		user.setPwd("12345");
		return user;
	}
}
