package com.jee.spring.service;

import com.jee.spring.dao.BaseDao;
import com.jee.spring.dao.BaseDaoImpl;
import com.jee.spring.pojo.User;

public class BaseServiceImpl implements BaseService{

	private BaseDao loginDao = new BaseDaoImpl();
	
	public boolean login(String username, String password) {
		return loginDao.login(username, password);
	}

	public String registration(User user) {
		return loginDao.register(user);
	}

}
