package com.coverletter.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Autowired public JavaMailSender emailSender;
	
	@Test
	public void contextLoads() {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("pitcher0303@gmail.com");
		msg.setSubject("메일 보내기 테스트");
		msg.setText("첫번째 메일 테스트");
		try {
		emailSender.send(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
