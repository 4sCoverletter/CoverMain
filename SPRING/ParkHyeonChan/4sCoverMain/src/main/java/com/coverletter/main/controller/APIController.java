package com.coverletter.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coverletter.main.data.Team;
import com.coverletter.main.parameter.RegisterParam;
import com.coverletter.main.service.TeamService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class APIController {
	@Autowired TeamService teamService;
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public Team getMember() {
		return teamService.getTeam();
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public RegisterParam register(@RequestBody RegisterParam registerParam) {
		
		return registerParam;
	}
}
