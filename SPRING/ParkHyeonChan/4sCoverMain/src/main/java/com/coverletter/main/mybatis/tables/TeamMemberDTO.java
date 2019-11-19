package com.coverletter.main.mybatis.tables;

import org.apache.ibatis.type.Alias;

@Alias("TeammemberDTO")
public class TeamMemberDTO {
	private String name;
	private String email_n;
	private String email_g;
	private String position;
	private String github;
	private String imgsrc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail_n() {
		return email_n;
	}
	public void setEmail_n(String email_n) {
		this.email_n = email_n;
	}
	public String getEmail_g() {
		return email_g;
	}
	public void setEmail_g(String email_g) {
		this.email_g = email_g;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGithub() {
		return github;
	}
	public void setGithub(String github) {
		this.github = github;
	}
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	
}
