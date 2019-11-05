package com.coverletter.main.mail;

import java.util.Date;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailTest {
	@Autowired public JavaMailSender mailSender;

	private String smtp_user = "pitcher0303@naver.com";
	private String smtp_password = "anfqud0303@";
	
	private String to_user_address = "pitcher0303@gmail.com";
	private String subject = "메일 보내기 테스트";
	private String content = "첫번째 메일 테스트";
	
	@RequestMapping(value = "/sendMail")
	public String sendMail(ModelAndView mav) {
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				// TODO Auto-generated method stub
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				InternetAddress from = new InternetAddress(smtp_user);
				helper.setFrom(from);
				InternetAddress to = new InternetAddress(to_user_address);
				InternetAddress[] toArr = {to};
				helper.setTo(toArr);
				helper.setSubject(subject);
				helper.setSentDate(new Date());
				helper.setText(content, true);
			}
		};
		mailSender.send(preparator);
		
		return "redirect:/Form/index";
	}
}
