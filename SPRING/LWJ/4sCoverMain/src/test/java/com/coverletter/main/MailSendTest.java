package com.coverletter.main;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailSendTest {
	@Autowired
	private JavaMailSender mailSender;
	
	private String smtp_user = "pitcher0303@naver.com";
	private String smtp_password = "anfqud0303@";
	
	private String to_user_address = "pitcher0303@gmail.com";
	private String subject = "메일 보내기 테스트";
	private String content = "첫번째 메일 테스트";
	
	private Properties props = new Properties();
	
	@Test
	public void MailSendTest1() {
		props.put("mail.smtp.host", "smtp.naver.com");
		props.put("mail.smtp.user", smtp_user);
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");
		
		Session session = Session.getDefaultInstance(props, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(smtp_user, smtp_password);
			}
			
		}); 
		
		MimeMessage message = new MimeMessage(session);
		try {
			InternetAddress from = new InternetAddress(smtp_user);
			message.setFrom(from);
			InternetAddress to = new InternetAddress(to_user_address);
			InternetAddress[] toArr = {to};
			message.setRecipients(Message.RecipientType.TO, toArr);
			message.setSubject(subject);
			message.setSentDate(new Date());
			message.setContent(content, "text/html;charset=utf-8");
			Transport.send(message);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void MailSendTest2() {
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
	}
}
