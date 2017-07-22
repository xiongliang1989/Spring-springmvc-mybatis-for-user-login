package com.xl.platform.moment.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xl.platform.moment.entity.Moment;

public interface MomentsMapper {

	@Select("insert into public.moments (user_id) values (#{user_id})")
	public void openMoments(int user_id);
	
	@Select("select id from public.moments where user_id=#{userId}")
	public String getIdByUserId(int userId);
	
	public void insert(Moment moment);
	
	public List<Moment> getAllMoments(String username);
}
