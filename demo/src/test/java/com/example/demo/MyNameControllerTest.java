package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.beans.factory.annotation.Autowired;

class MyNameControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getMyNameReturnsOk() throws Exception {
		this.mockMvc.perform(get("/myName")).andExpect(status().isOk());
	}

}
