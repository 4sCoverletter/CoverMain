package com.coverletter.main.data;

import java.util.Date;

public class ResumeVO {
	private int id;
	private String name;
	private Date updated_date;
	
	public ResumeVO(int i, String string, Date date) {
		this.id = i;
		this.name = string;
		this.updated_date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
}
