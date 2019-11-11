package com.coverletter.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.coverletter.main.parameter.RegisterParam;

@CrossOrigin
@RestController
@RequestMapping(value="/Service")
public class ServiceController {
	
	@RequestMapping(value="/Register", method=RequestMethod.POST)
	public ModelAndView RegisterService(RegisterParam param) {
		//1.Parameter 값 Null, "" 체크
		if(!param.nullCheck()) {
			
		}
		//2.id 중복체크 (id는 email)
		
		//에러처리
		//3.톤큰 생성(이메일 인증용 토큰)
		
		//4.비밀번호 암호화
		
		//5.데이터베이스 C작업
		
		//6.인증메일 발송
		
		//7.index로 이동
		return new ModelAndView(new RedirectView("/Form/index", false));
	}
}
