package com.xl.user.service;

import com.xl.user.entity.User;

public interface UserService {
	
	public boolean verifyLogin(User user);
	
	public void insert(User user);
	
	public String getPassordByUsername(String username);
	
	public int getCountByUsername(String username);
	
}
