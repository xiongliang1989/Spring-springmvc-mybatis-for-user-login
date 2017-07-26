package com.xl.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/platform")
public class UserLoginMainController {
	
	@RequestMapping("/login")
	public String login(){
		return "mainPage";
	}
	
	
}
