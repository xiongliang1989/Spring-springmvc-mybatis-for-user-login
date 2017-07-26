package com.xl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.user.entity.User;
import com.xl.user.mapper.UserMapper;
import com.xl.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public boolean verifyLogin(User user) {
		String password = userMapper.getPassordByUsername(user.getUsername());
		if(password == null || !password.equals(user.getPassword())){
			return false;
		}else {
			return true;			
		}
	}
	
	public void insert(User user) {
		userMapper.insert(user);
	}
	
	public String getPassordByUsername(String username){
		return userMapper.getPassordByUsername(username);
	}

	public int getCountByUsername(String username) {
		return userMapper.getCountByUsername(username);
	}

}
