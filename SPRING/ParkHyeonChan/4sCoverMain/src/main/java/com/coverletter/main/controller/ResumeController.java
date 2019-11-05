package com.coverletter.main.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coverletter.main.data.ResumeVO;

@CrossOrigin
@RestController
@RequestMapping(value="/resume")
public class ResumeController {
	@RequestMapping("/select")
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
