package com.coverletter.main.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.coverletter.main.mybatis.tables.TeamMemberDTO;

@Repository
public class Team {
	private int count;
	private List<TeamMemberDTO> members;
	public Team() {
		
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<TeamMemberDTO> getMembers() {
		return members;
	}
	public void setMembers(List<TeamMemberDTO> members) {
		this.members = members;
	}
	
}
