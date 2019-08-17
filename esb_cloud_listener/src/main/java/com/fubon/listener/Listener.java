package com.fubon.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fubon.utils.HttpUtils;

@SpringBootApplication
@RestController
public class Listener {

	public static void main(String[] args) {
		SpringApplication.run(Listener.class, args);
	}

	@RequestMapping("/")
	public String httpListener(String txnCode) {
		return HttpUtils.doGet(System.getenv("BUSINESS_URL")+"?txnCode="+txnCode);
	}
}
