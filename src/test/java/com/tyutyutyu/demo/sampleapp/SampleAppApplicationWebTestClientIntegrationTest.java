package com.tyutyutyu.demo.sampleapp;

import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleAppApplicationWebTestClientIntegrationTest {

	@Autowired
	private WebTestClient webClient;

	@Test
	public void testStatusReturnOk() throws Exception {

		// given

		// when
		// @formatter:off
		webClient.get()
				.uri("/status")
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.exchange()

		// then
				.expectStatus().isOk()
				.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
				.expectBody()
					.jsonPath("$.status", is("OK"));
		// @formatter:on
	}

}
