package com.coverletter.main.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coverletter.main.data.Members;
import com.coverletter.main.data.TeamMember;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class APIController {
	static final String[] MEMBERNAMES = {"박 현찬", "최 영석", "이 원준", "이 주영"};
	static final String[] NAVEREMAILS = {"pitcher0303@naver.com", "blackhawk737@naver.com", 
										 "rhkdqhrehddl@naver.com", "ljoy1994@naver.com"};
	static final String[] GMAILS = {"pitcher0303@gmail.com", "ghkseh123@gmail.com", 
									"rhkdqhrehddl@gmail.com", "leejoy1994@gmail.com"};
	static final String[] POSITIONS = {"Lead Designer", "Lead Designer", "Lead Designer", "Lead Designer"};
	static final String[] GITHUBS = {"https://github.com/pitcher0303", "https://github.com/YeongseokChoi", 
									 "https://github.com/rhkdqhrehddl", "https://github.com/leejoy980"};
	static final String[] IMGS = {"http://106.10.46.34:9000/img/team/1.jpg", "http://106.10.46.34:9000/img/team/member2.jpg", 
								  "http://106.10.46.34:9000/img/team/1.jpg", "http://106.10.46.34:9000/img/team/1.jpg"};
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public Members getMember() {
		Members data = new Members();
		
		data.setCount(4);
		//make --> mybatis call
		ArrayList<TeamMember> teams = new ArrayList<TeamMember>();
		for(int i = 0; i < 4; i++) {
			TeamMember member = new TeamMember();
			member.setName(MEMBERNAMES[i]);
			member.setN_email(NAVEREMAILS[i]);
			member.setG_email(GMAILS[i]);
			member.setPosition(POSITIONS[i]);
			member.setGithub(GITHUBS[i]);
			member.setImgsrc(IMGS[i]);
			teams.add(member);
		}
		//end
		data.setTeams(teams);
		
		return data;
	}
}
