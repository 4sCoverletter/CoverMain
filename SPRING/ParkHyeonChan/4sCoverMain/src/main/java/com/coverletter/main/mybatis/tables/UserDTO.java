package com.coverletter.main.mybatis.tables;

public class UserDTO {
	private String uemail;
	private String uname;
	private String upassword;
	private String tid;
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return uemail + " : " + uname + " : " + upassword + " : " + tid;
	}
	
	
}
