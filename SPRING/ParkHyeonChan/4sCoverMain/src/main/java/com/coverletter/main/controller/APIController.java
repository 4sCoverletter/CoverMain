package com.coverletter.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coverletter.main.data.Team;
import com.coverletter.main.parameter.RegisterParam;
import com.coverletter.main.service.TeamService;

//@CrossOrigin
@RestController
@RequestMapping("/api")
public class APIController {
	//@Autowired TeamService teamService;
	/*
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public ResponseEntity<Team> getMember() {
		return new ResponseEntity<Team>(teamService.getTeam(), HttpStatus.OK);
	}
	*/
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String getMember() {
		return "Get Members";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public ResponseEntity<RegisterParam> register(@RequestBody @Valid RegisterParam registerParam, Errors errors) {
		if(errors.hasErrors()) {
			return new ResponseEntity<>(registerParam, HttpStatus.BAD_REQUEST);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.set("Location", "/api/register");
		return new ResponseEntity<>(registerParam, headers, HttpStatus.OK);
	}
}
