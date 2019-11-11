package com.coverletter.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coverletter.main.data.Team;
import com.coverletter.main.mybatis.mapper.TeammemberMapper;
import com.coverletter.main.mybatis.tables.TeamMemberDTO;

@Service
public class TeamService {
	@Autowired TeammemberMapper teamMapper;
	
	public Team getTeam() {
		Team team = new Team();
		List<TeamMemberDTO> members = teamMapper.findAll();
		team.setCount(members.size());
		team.setMembers(members);
		
		return team;
	}
}
