package com.coverletter.main.mybatis.tables;

import org.apache.ibatis.type.Alias;

@Alias("UserDTO")
public class UserDTO {
	private String uemail;
	private String uname;
	private String upassword;
	private String tid;
	
	public UserDTO() {
		this.tid = "0";
	}
	
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
