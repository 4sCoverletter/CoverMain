package com.coverletter.main.data;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class Members {
	private int count;
	private ArrayList<TeamMember> teams;
	public Members() {
		
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ArrayList<TeamMember> getTeams() {
		return teams;
	}
	public void setTeams(ArrayList<TeamMember> teams) {
		this.teams = teams;
	}
	
}
