package com.coverletter.main;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.coverletter.main.errors.Exception.DuplicateIdException;
import com.coverletter.main.mybatis.mapper.UserMapper;
import com.coverletter.main.mybatis.tables.UserDTO;
import com.coverletter.main.requestparam.RegisterParam;
import com.coverletter.main.service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {
	@Autowired UserService uService;
	@Autowired UserMapper userMapper;
	RegisterParam registerParam;
	
	@Before
	public void setup() {
		registerParam = new RegisterParam();
		registerParam.setUserName("박현찬");
		registerParam.setUserEmail("pitcher03@gmail.com");
		registerParam.setUserPassword("anfqud0303");
		registerParam.setUserPasswordRepeat("anfqud0303");
	}
	
	@Test
	public void userServiceTest() {
		try {
			uService.registerUser(registerParam);
		} catch (DuplicateIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void bcryptPasswordEncoder() {
		try {
			UserDTO userDTO = userMapper.findByEmail("pitcher03@gmail.com");
			System.out.println("비밀번호 동일 여부: " + new BCryptPasswordEncoder().matches("anfqud0303", userDTO.getUpassword()));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
