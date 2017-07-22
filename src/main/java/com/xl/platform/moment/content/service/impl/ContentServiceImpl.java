package com.xl.platform.moment.content.service.impl;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.platform.moment.content.entity.Content;
import com.xl.platform.moment.content.mapper.ContentMapper;
import com.xl.platform.moment.content.service.ContentService;
import com.xl.platform.moment.mapper.MomentsMapper;
import com.xl.user.entity.User;
import com.xl.user.mapper.UserMapper;

@Service
public class ContentServiceImpl implements ContentService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private MomentsMapper momentsMapper;
	
	@Autowired
	private ContentMapper contentMapper;
	
	public List<Content> uploadAndShare(HttpServletRequest request){
		List<Content> contentsList;
		User user = (User)request.getSession().getAttribute("user");
		String userId = userMapper.getIdByUsername(user.getUsername());
		String momentsId = momentsMapper.getIdByUserId(Integer.parseInt(userId));
		Content content = getContent(request, momentsId);
		contentMapper.insert(content);
		contentsList = contentMapper.getAllContents(Integer.parseInt(momentsId));
		
		return contentsList;
	}
	
	public List<Content> initShare(HttpServletRequest request){
		List<Content> contentsList;
		User user = (User)request.getSession().getAttribute("user");
		String userId = userMapper.getIdByUsername(user.getUsername());
		String momentsId = momentsMapper.getIdByUserId(Integer.parseInt(userId));
		contentsList = contentMapper.getAllContents(Integer.parseInt(momentsId));
		
		return contentsList;
	}

	private Content getContent(HttpServletRequest request, String momentsId) {
		Content content = new Content();
		content.setContent_data(request.getParameter("content"));
		content.setCdate(new Date(System.currentTimeMillis()));
		content.setMoments_id(Integer.parseInt(momentsId));
		return content;
	}

}
