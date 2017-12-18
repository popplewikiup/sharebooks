package com.xin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xin.dao.UserDao;
import com.xin.model.User;
import com.xin.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}

}
