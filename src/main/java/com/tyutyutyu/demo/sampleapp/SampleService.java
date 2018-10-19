package com.tyutyutyu.demo.sampleapp;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@SuppressWarnings("static-method")
	public String checkStatus() {

		return "OK";
	}

}
