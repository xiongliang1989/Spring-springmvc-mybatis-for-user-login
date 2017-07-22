package com.xl.platform.moment.controller;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.FloatSeqHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xl.platform.moment.service.CommentsService;
import com.xl.user.entity.User;

@Controller
@RequestMapping("/platform/moment")
public class MomentsController {
	
	@Autowired
	private CommentsService commentsService;

	@RequestMapping("/login")
	public String userLogin(HttpServletRequest request){
		User user = getUser(request);
		Boolean isLoginSuccess = commentsService.verifyLogin(user);
		if(isLoginSuccess == false){
			return "login";
		}
		request.getSession().setAttribute("user", user);
		return "mainPage";
	}
	
	public User getUser(HttpServletRequest request){
		User user = new User();
		user.setUsername(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		return user;
	}
	
	@RequestMapping("/judgeOpenMoments")
	@ResponseBody
	public String judgeOpenMoment(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			return commentsService.judgeOpenMoment(user.getUsername());
		}else{
			return "false";
		}
	}
	
	@RequestMapping("/openMoments")
	@ResponseBody
	public String openMoments(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			commentsService.openMoments(user.getUsername());
			return "true";
		}
		return "false";
	}

}
