package com.coverletter.main.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailTest {
	@Autowired public JavaMailSender emailSender;
	
	@RequestMapping(value = "/sendMail")
	public ModelAndView sendMail(ModelAndView mav) {

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("pitcher0303@gmail.com");
		msg.setSubject("메일 보내기 테스트");
		msg.setText("첫번째 메일 테스트");
		try {
		emailSender.send(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		mav.setViewName("index.html");
		return mav;
	}
}
