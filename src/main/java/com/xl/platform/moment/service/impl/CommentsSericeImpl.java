package com.xl.platform.moment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.platform.moment.entity.Moment;
import com.xl.platform.moment.mapper.MomentsMapper;
import com.xl.platform.moment.service.CommentsService;
import com.xl.user.entity.User;
import com.xl.user.mapper.UserMapper;

@Service
public class CommentsSericeImpl implements CommentsService {

	@Autowired
	private MomentsMapper momentsMapper;

	@Autowired
	private UserMapper userMapper;

	public boolean verifyLogin(User user) {
		String password = userMapper.getPassordByUsername(user.getUsername());
		return password.equals(user.getPassword());
	}

	public void openMoments(String username) {
		String user_id = userMapper.getIdByUsername(username);
		momentsMapper.openMoments(Integer.parseInt(user_id));
	}

	public String judgeOpenMoment(String username) {
		String user_id = userMapper.getIdByUsername(username);
		String momentId = momentsMapper.getIdByUserId(Integer.parseInt(user_id));
		if(momentId == null){
			return "false";
		}else{
			return "true";
		}
		
	}
	
	public void insert(Moment moment) {
		momentsMapper.insert(moment);
	}

	public List<Moment> getAllMoments(String username) {
		return momentsMapper.getAllMoments(username);
	}

	

}
