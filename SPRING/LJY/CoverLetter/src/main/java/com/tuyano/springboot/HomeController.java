package com.tuyano.springboot;



import org.json.simple.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "html/index";
    }
    
    @RequestMapping("/CoverLetter")
    public String CoverLetter(Model model){
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "html/CoverLetter/CoverLetter";
    }
    
    @RequestMapping("/view")
    public String view(Model model){
    	
        
        return "html/index";
    }
    
    @SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value="/ajax")
	public JSONArray join() {
    	
    	String[] name_arr = {"박 현찬", "최 영석", "이 원준", "이 주영"};
		String[] naver_arr = {"pitcher0303@naver.com", "blackhawk737@naver.com", "rhkdqhrehddl@naver.com", "ljoy1994@naver.com"};
		String[] google_arr = {"pitcher0303@gmail.com", "ghkseh123@gmail.com", "rhkdqhrehddl@gmail.com", "leejoy1994@naver.com"};
		String[] git_arr = {"https://github.com/pitcher0303", "https://github.com/YeongseokChoi", "https://github.com/rhkdqhrehddl", "https://github.com/leejoy980"};
		
		JSONArray jsonArr = new JSONArray();
		for(int i = 0; i < name_arr.length; i++) {
			memberVO vo = new memberVO();
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
    
    @SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value="/Portfolio")
	public JSONArray Portfolio() {
    	
    	String[] name_arr = {"박 현찬", "최 영석", "이 원준", "이 주영"};
		String[] naver_arr = {"pitcher0303@naver.com", "blackhawk737@naver.com", "rhkdqhrehddl@naver.com", "ljoy1994@naver.com"};
		String[] google_arr = {"pitcher0303@gmail.com", "ghkseh123@gmail.com", "rhkdqhrehddl@gmail.com", "leejoy1994@naver.com"};
		String[] git_arr = {"https://github.com/pitcher0303", "https://github.com/YeongseokChoi", "https://github.com/rhkdqhrehddl", "https://github.com/leejoy980"};
		
		JSONArray jsonArr = new JSONArray();
		for(int i = 0; i < name_arr.length; i++) {
			memberVO vo = new memberVO();
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
