package com.xl.platform.moment.content.entity;

import java.sql.Date;

public class Content {

	private int id;
	private String content_data;
	private int moments_id;
	private Date cdate;
	private Date mdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent_data() {
		return content_data;
	}
	public void setContent_data(String content_data) {
		this.content_data = content_data;
	}
	public int getMoments_id() {
		return moments_id;
	}
	public void setMoments_id(int moments_id) {
		this.moments_id = moments_id;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	
}
