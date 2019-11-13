package com.coverletter.main;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.coverletter.main.controller.APIController;
import com.coverletter.main.parameter.RegisterParam;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
	private MockMvc mockMvc;
	private RegisterParam registerParam;
	private String JsonRequest;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		registerParam = new RegisterParam();
		registerParam.setUserName("박현찬");
		registerParam.setUserEmail("pitcher0303@gmail.com");
		registerParam.setUserPassword("anfqud0303");
		registerParam.setUserPasswordRepeat("anfqud0303");
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter objWriter = objMapper.writer().withDefaultPrettyPrinter();
		try {
			JsonRequest = objWriter.writeValueAsString(registerParam);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TeamTest(){
		try {
			this.mockMvc.perform(get("/api/member"))
			.andDo(print())
			.andExpect(status().isOk());
			//.andExpect((ResultMatcher) content().string("Get"))
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void registerTest() throws Exception {
		this.mockMvc.perform(post("/api/register")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(JsonRequest))
				.andDo(print());
	}
}
