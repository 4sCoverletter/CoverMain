package com.tuyano.springboot;



import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
    @RequestMapping("/CreatePortfolio")
    public String CreatePortfolio(Model model){
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "html/CoverLetter/CreatePortfolio";
    }
    @RequestMapping("/CreatePortfolio3")
    public String CreatePortfolio3(Model model){
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "html/CoverLetter/CreatePortfolio3";
    }

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "html/CoverLetter/test";
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
	@RequestMapping(value="/Portfolios")
	public JSONArray Portfolios() {
    	
    	String[] url_arr = {"src='img/portfolio-1.jpg'", "src='img/portfolio-2.jpg'", "src='img/portfolio-3.jpg'", "src='img/portfolio-3.jpg'"};
		String[] title_arr = {"Stationary", "Test1", "Test2", "Test2"};
		String[] content_arr = {"Test_Content", "Test_Content1", "Test_Content2", "Test_Content2"};
		
		JSONArray jsonArr = new JSONArray();
		for(int i = 0; i < url_arr.length; i++) {
			portfolioVO vo = new portfolioVO();
			vo.setTitleUrl(url_arr[i]);
			vo.setTitle(title_arr[i]);
			vo.setContent(content_arr[i]);

			jsonArr.add(vo);
		}
		return jsonArr;
    }
    
    @SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value="/Portfolio")
	public portfolioVO Portfolio() {
    	
    	ArrayList<String> url = new ArrayList<>();
    	url.add("img/portfolio-1.jpg");
    	url.add("img/portfolio-2.jpg");
    	url.add("img/portfolio-3.jpg");
    	
    	portfolioVO vo = new portfolioVO();
    	vo.setContent("Test Content");
    	vo.setTitle("Test Title");
    	vo.setSkill("Test Skill");
    	vo.setNum(4);
    	vo.setTerm("한달");
    	vo.setTitleUrl("img/portfolio-2.jpg");
    	vo.setWork("Lead Designer");
    	vo.setUrl(url);
    	
    
    
		return vo;
    }
    
    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(MultipartFile[] filesTemp) {
    	
    	System.out.println("filesCount : " + filesTemp.length);
    	List<MultipartFile> value = new ArrayList<>();
    	for(MultipartFile file : filesTemp)
    		value.add(file);
		return "success";
    }
}
