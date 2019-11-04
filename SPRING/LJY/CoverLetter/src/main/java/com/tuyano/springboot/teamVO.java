package com.tuyano.springboot;

import java.util.ArrayList;
import java.util.List;

public class teamVO {
	private int num;
	List<memberVO> memberList = new ArrayList<memberVO>();
	
	public int getNum() {
		return num;
	}
	public List<memberVO> getMember() {
		return memberList;
	}
	public void setMember(memberVO member) {
		memberList.add(member);
		this.num = memberList.size();
	}
	
	
}
