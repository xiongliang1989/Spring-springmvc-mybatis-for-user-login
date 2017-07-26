package com.xl.platform.moment.service;

import java.util.List;

import com.xl.platform.moment.entity.Moment;

public interface CommentsService {
	
	public void openMoments(String username);
	
	public String judgeOpenMoment(String username);
	
	public void insert(Moment moment);
	
	public List<Moment> getAllMoments(String username);

}
