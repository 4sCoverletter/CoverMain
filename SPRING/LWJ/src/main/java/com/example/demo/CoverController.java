package com.example.demo;

import java.util.Map;

import org.json.simple.JSONArray;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class CoverController {
	@RequestMapping("/cover")
	public String index() {
		return "/html/index.html";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/ajax")
	@ResponseBody
	public JSONArray ajax(){
		String[] name_arr = {"박 현찬", "최 영석", "이 원준", "이 주영"};
		String[] naver_arr = {"pitcher0303@naver.com", "blackhawk737@naver.com", "rhkdqhrehddl@naver.com", "ljoy1994@naver.com"};
		String[] google_arr = {"pitcher0303@gmail.com", "ghkseh123@gmail.com", "rhkdqhrehddl@gmail.com", "leejoy1994@naver.com"};
		String[] git_arr = {"https://github.com/pitcher0303", "https://github.com/YeongseokChoi", "https://github.com/rhkdqhrehddl", "https://github.com/leejoy980"};
		
		JSONArray jsonArr = new JSONArray();
		for(int i = 0; i < name_arr.length; i++) {
			TeamVO vo = new TeamVO();
			vo.setName(name_arr[i]);
			vo.setNaver(naver_arr[i]);
			vo.setGoogle(google_arr[i]);
			vo.setGit(git_arr[i]);
			vo.setPosition("Lead Designer");
			vo.setUrl("../img/team/member2.jpg");
			jsonArr.add(vo);
		}
		return jsonArr;
	}
}
