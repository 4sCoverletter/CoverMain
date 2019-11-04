package com.tuyano.springboot;

public class memberVO {
	private String name;
	private String Naver;
	private String Google;
	private String Git;
	private String Position;
	private String Url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return Position;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getNaver() {
		return Naver;
	}
	public void setNaver(String naver) {
		Naver = naver;
	}
	public String getGoogle() {
		return Google;
	}
	public void setGoogle(String google) {
		Google = google;
	}
	public String getGit() {
		return Git;
	}
	public void setGit(String git) {
		Git = git;
	}
}
