package com.tyutyutyu.demo.sampleapp;

import java.util.Collections;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleController {

	private final SampleService sampleService;

	@RequestMapping("/status")
	public Map<String, String> status() {

		return Collections.singletonMap("status", sampleService.checkStatus());
	}

}
