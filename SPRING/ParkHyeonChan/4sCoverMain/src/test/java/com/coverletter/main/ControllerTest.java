package com.coverletter.main;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

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
	
	@MockBean
	APIController apiController;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(apiController).build();
		registerParam = new RegisterParam();
		registerParam.setUserName("박현찬");
		registerParam.setUserEmail("pitcher0303@gmail.com");
		registerParam.setUserPassword("anfqud0303");
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
	public void registerTest() throws Exception {
		mockMvc.perform(post("/api/register")
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(JsonRequest))
		.andDo(print())
		.andExpect(status().isBadRequest());
	}
}
