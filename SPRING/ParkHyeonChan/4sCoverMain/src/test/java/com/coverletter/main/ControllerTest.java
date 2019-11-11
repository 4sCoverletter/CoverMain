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

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
	private MockMvc mockMvc;
	private RegisterParam registerParam;
	
	@MockBean
	APIController apiController;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(apiController).build();
		registerParam = new RegisterParam();
		registerParam.setUserName("박현찬");
		registerParam.setUserEmail("pitcher0303@gmail.com");
		registerParam.setUserPassword("anfqud0303");
	}
	
	@Test
	public void registerTest() throws Exception {
		mockMvc.perform(post("/api/register")
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.param("userName", "박현찬")
				.param("userEmail", "pitcher0303@gmail.com"))
		.andDo(print())
		.andExpect(status().isOk());
	}
}
