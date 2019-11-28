
package com.tuyano.springboot;

import java.util.ArrayList;

public class portfolioVO {
	
	private String titleUrl;
	private ArrayList<String> url;
	private String title;
	private String content;
	private String term;
	private String work;
	private int num;
	private String skill;
	
	
	public String getTitleUrl() {
		return titleUrl;
	}
	public void setTitleUrl(String titleUrl) {
		this.titleUrl = titleUrl;
	}
	public ArrayList<String> getUrl() {
		return url;
	}
	public void setUrl(ArrayList<String> url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	

}
