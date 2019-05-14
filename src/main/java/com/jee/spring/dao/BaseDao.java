package com.jee.spring.dao;

import com.jee.spring.pojo.User;

public interface BaseDao {
	
	 public boolean login(String username, String password);
	 public String register(User user);
 
}