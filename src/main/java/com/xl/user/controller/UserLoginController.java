package com.xl.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xl.user.entity.User;
import com.xl.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserLoginController {	

	@Autowired
	private UserService userService;
	
	@RequestMapping("/registryPage")
	public String getRegistryPage(HttpServletRequest request){
	
		return "registry";
	}
	
	@RequestMapping("/loginPage")
	public String getLoginPage(HttpServletRequest request){
		User user = getUser(request);		
		request.getSession().setAttribute("user", user);
		return "login";
	}
	
	@RequestMapping("/registry")
	@ResponseBody
	public String userRegistry(HttpServletRequest request){
		User user = getUser(request);
		int userCount = userService.getCountByUsername(user.getUsername());
		if(userCount > 0){
			return "username has existed!";
		}
		userService.insert(user);		
		request.getSession().setAttribute("user", user);
		
		return "registry sucess!";
	}
	
	public User getUser(HttpServletRequest request){
		User user = new User();
		user.setUsername(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		return user;
	}
	

}
