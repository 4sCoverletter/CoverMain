package com.coverletter.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@RestController
@RequestMapping(value="/Form")
public class FormController {
	@RequestMapping(value = "/index")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value = "/register")
	public ModelAndView register(ModelAndView mav) {
		mav.setViewName("register");
		return mav;
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping(value = "/forgot_password")
	public ModelAndView forgot_password(ModelAndView mav) {
		mav.setViewName("forgot-password");
		return mav;
	}
}
