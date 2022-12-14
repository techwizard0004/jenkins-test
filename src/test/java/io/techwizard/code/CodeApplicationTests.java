package io.techwizard.code;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class CodeApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	String mainUrl = "http://localhost:8080/backend";

	@Test
	void addTest() throws Exception {

		this.mockMvc
				.perform(
						get(mainUrl + "/add"+"/2/3")
								.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(String.valueOf(5)))
				.andDo(print());
	}

	@Test
	void subtractTest() throws Exception {

		this.mockMvc
				.perform(
						get(mainUrl + "/subtract"+"/5/2")
								.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(String.valueOf(3)))
				.andDo(print());
	}

}
