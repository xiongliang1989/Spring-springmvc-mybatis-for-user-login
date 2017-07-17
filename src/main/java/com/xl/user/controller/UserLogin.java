package com.xl.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xl.user.entity.User;
import com.xl.user.service.impl.UserService;

@Controller
@RequestMapping("/user")
public class UserLogin {
	

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String userLogin(){
		User user = new User();
		user.setEmail("xl@foxmail.com");
		user.setUsername("xl");
		user.setPassword("123456");
		userService.insert(user);
		return "success";
	}
	

}
