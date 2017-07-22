package com.xl.user.mapper;

import org.apache.ibatis.annotations.Select;

import com.xl.user.entity.User;

public interface UserMapper {
	
	@Select("INSERT INTO public.user (username, email, password) VALUES (#{username}, #{email}, #{password})")
	public void insert(User user);
	
	@Select("select id from public.user where username=#{username}")
	public String getIdByUsername(String username);
	
	@Select("SELECT password FROM public.user WHERE username = #{username}")
	public String getPassordByUsername(String username);
	
	@Select("select count(*) from public.user where username=#{username}")
	public int getCountByUsername(String username);
	
}
