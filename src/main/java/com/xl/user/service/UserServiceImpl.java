package com.xl.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.user.entity.User;
import com.xl.user.mapper.UserMapper;
import com.xl.user.service.impl.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public void insert(User user) {
		userMapper.insert(user);
	}

}
