package com.jee.spring.service;

import com.jee.spring.pojo.User;

public interface BaseService {
	
	 public boolean login(String username, String password);
	 public String registration(User user);
	 
}
