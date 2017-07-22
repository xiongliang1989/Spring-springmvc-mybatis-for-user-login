package com.xl.platform.moment.content.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xl.platform.moment.content.entity.Content;

public interface ContentMapper {
	
	@Select("insert into public.content (content_data, cdate, moments_id) values (#{content_data}, #{cdate}, #{moments_id})")
	public void insert(Content content);

	@Select("select * from public.content where moments_id=#{momentsId}")
	public List<Content> getAllContents(int momentsId);
}
