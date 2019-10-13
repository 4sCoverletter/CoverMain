package com.tuyano.springboot;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    
    @RequestMapping("/view")
    public String view(Model model){
    	
    	memberVO member1 = new memberVO();
    	member1.setGit("git1");
    	member1.setGoogle("googlo1");
    	member1.setName("이름1");
    	member1.setNaver("naver1");
    	
    	memberVO member2 = new memberVO();
    	member2.setGit("git2");
    	member2.setGoogle("googlo2");
    	member2.setName("이름2");
    	member2.setNaver("naver2");
    	
    	memberVO member3 = new memberVO();
    	member3.setGit("git3");
    	member3.setGoogle("googlo3");
    	member3.setName("이름3");
    	member3.setNaver("naver3");
    	
    	memberVO member4 = new memberVO();
    	member4.setGit("git4");
    	member4.setGoogle("googlo4");
    	member4.setName("이름4");
    	member4.setNaver("naver4");
    	
    	ArrayList<memberVO> member = new ArrayList<memberVO>();
    	member.add(member1);
    	member.add(member2);
    	member.add(member3);
    	member.add(member4);
		
        model.addAttribute("member", member);
        
        return "html/view";
    }
    
    @ResponseBody
	@RequestMapping(value="/join")
	public Object join() {
    	HashMap<String, Object> map = new HashMap<String, Object>();
    	
    	memberVO member1 = new memberVO();
    	member1.setGit("git1");
    	member1.setGoogle("googlo1");
    	member1.setName("이름1");
    	member1.setNaver("naver1");
    	
    	memberVO member2 = new memberVO();
    	member2.setGit("git2");
    	member2.setGoogle("googlo2");
    	member2.setName("이름2");
    	member2.setNaver("naver2");
    	
    	memberVO member3 = new memberVO();
    	member3.setGit("git3");
    	member3.setGoogle("googlo3");
    	member3.setName("이름3");
    	member3.setNaver("naver3");
    	
    	memberVO member4 = new memberVO();
    	member3.setGit("git4");
    	member3.setGoogle("googlo4");
    	member3.setName("이름4");
    	member3.setNaver("naver4");
    	
    	
    	
		map.put("member1", member1);
		map.put("member2", member2);
		map.put("member3", member3);
		map.put("member4", member4);
		
		return map;
    }
}
