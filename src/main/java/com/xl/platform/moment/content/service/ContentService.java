package com.xl.platform.moment.content.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.xl.platform.moment.content.entity.Content;

public interface ContentService {

	public List<Content> uploadAndShare(HttpServletRequest request);

	public List<Content> initShare(HttpServletRequest request);
	
}
