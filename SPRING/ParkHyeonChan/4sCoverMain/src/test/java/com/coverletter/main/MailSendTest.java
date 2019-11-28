package com.coverletter.main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;

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
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailSendTest {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private TemplateEngine engine;
	
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
	
	@Test
	public void readTemplateTest() {
		Context ctx = new Context(Locale.US);
		String content = engine.process("/email/signUp_EmailVerify", ctx);
		System.out.println(content);
	}
	
	@Test
	public void randomKeyTest() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for(int i = 0; i < 20; i++) {
			int key = rnd.nextInt(3);
			switch (key) {
			case 0:
				temp.append((char) (int)(rnd.nextInt(26) + 97));
				break;
			case 1:
				temp.append((char) (int)(rnd.nextInt(26) + 65));
				break;
			case 2:
				temp.append((char) (int)(rnd.nextInt(10)));
				break;
			default:
				break;
			}
		}
		md.update(temp.toString().getBytes());
		System.out.println(bytesToHexa(md.digest()).length());
		System.out.println(bytesToHexa(md.digest()));
	}
	public static String bytesToHexa(byte[] bytes) {
		StringBuilder builder = new StringBuilder();
		for(byte b : bytes) {
			builder.append(String.format("%02x", b));
		}
		return builder.toString();
	}
}
