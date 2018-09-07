package com.tyutyutyu.demo.sampleapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/status")
	@SuppressWarnings("static-method")
	public String status() {

		return "OK";
	}

}
