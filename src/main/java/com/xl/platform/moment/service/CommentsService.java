package com.xl.platform.moment.service;

import java.util.List;

import com.xl.platform.moment.entity.Moment;
import com.xl.user.entity.User;

public interface CommentsService {
	
	public boolean verifyLogin(User user);
	
	public void openMoments(String username);
	
	public String judgeOpenMoment(String username);
	
	public void insert(Moment moment);
	
	public List<Moment> getAllMoments(String username);

}
