package com.xl.platform.moment.content.controller;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xl.platform.moment.content.service.ContentService;
import com.xl.platform.moment.entity.Moment;

@Controller
@RequestMapping("/platform/moment/content")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@RequestMapping("/uploadAndShare")
	@ResponseBody
	public String uploadAndShare(HttpServletRequest request) {
		String json = JSONObject.valueToString(contentService.uploadAndShare(request)).toString();
		System.out.println(json);
		return json;
	}
	
	@RequestMapping("/initShare")
	@ResponseBody
	public String initShare(HttpServletRequest request) {
		String json = JSONObject.valueToString(contentService.initShare(request)).toString();
		System.out.println(json);
		return json;
	}

	public Moment getOneComents(HttpServletRequest request) {
		Moment moment = new Moment();
		return moment;
	}

}
