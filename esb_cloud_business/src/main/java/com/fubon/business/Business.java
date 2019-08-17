package com.fubon.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Business {

	public static void main(String[] args) {
		SpringApplication.run(Business.class, args);
	}

	@RequestMapping("/")
	public String BusinessNormal(String txnCode) {
		return "Your txnCode is : " + txnCode;
	}
}
