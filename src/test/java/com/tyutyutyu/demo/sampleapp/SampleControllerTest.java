package com.tyutyutyu.demo.sampleapp;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

// TODO: Tomcat cause: WARNING: Illegal reflective access by org.apache.catalina.loader.WebappClassLoaderBase
// (file:/C:/Users/Tyutyutyu/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/8.5.34/tomcat-embed-core-8.5.34.jar) to method
// java.lang.ThreadLocal$ThreadLocalMap.expungeStaleEntries()

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = SampleController.class)
public class SampleControllerTest {

	@Autowired
	public MockMvc mockMvc;

	@MockBean
	public SampleService sampleService;

	@Test
	public void testStatus() throws Exception {

		// given
		String testStatus = "TEST";
		when(sampleService.checkStatus()).thenReturn(testStatus);

		// when
		// @formatter:off
		mockMvc.perform(get("/status").accept(MediaType.APPLICATION_JSON_UTF8))

		// then
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(jsonPath("$.status", is(testStatus)));
		// @formatter:on
	}

}
