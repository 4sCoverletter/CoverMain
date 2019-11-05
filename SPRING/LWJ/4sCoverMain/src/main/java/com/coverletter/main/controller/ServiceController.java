package com.coverletter.main.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.coverletter.main.data.ResumeVO;
import com.coverletter.main.parameter.RegisterParam;

@CrossOrigin
@RestController
@RequestMapping(value="/Service", method=RequestMethod.POST)
public class ServiceController {
	public ModelAndView RegisterService(RegisterParam param) {
		//1.Parameter 값 Null, "" 체크
		
		//2.id 중복체크 (id는 email)
		//에러처리
		//3.톤큰 생성(이메일 인증용 토큰)
		//4.비밀번호 암호화
		//5.데이터베이스 C작업
		//6.인증메일 발송
		
		//7.index로 이동
		return new ModelAndView(new RedirectView("/Form/index", true));
	}
	
	@RequestMapping("/select_resume")
	//추후에 userID를 매개변수로 받아 User에 해당하는 이력서 목록만 조회
	public List<ResumeVO> selectResume() {
		List<ResumeVO> resume_list = new ArrayList<ResumeVO>();
		
		resume_list.add(new ResumeVO(1, "회사와 사회에 모두 기여할 수 있는 인재 입니다", new Date()));
		resume_list.add(new ResumeVO(2, "회사와 사회에 모두 기여할 수 있는 인재 입니다", new Date()));
		resume_list.add(new ResumeVO(3, "회사와 사회에 모두 기여할 수 있는 인재 입니다", new Date()));
		resume_list.add(new ResumeVO(4, "회사와 사회에 모두 기여할 수 있는 인재 입니다", new Date()));
		resume_list.add(new ResumeVO(5, "회사와 사회에 모두 기여할 수 있는 인재 입니다", new Date()));
		
		return resume_list;
	}
}
