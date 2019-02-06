package com.diary.controller;

import org.diary.main.ConstantStr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstController {
	
	@RequestMapping("/hello")
	String home() {
		return ConstantStr.HELLO_WORLD;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FirstController.class, args);
	}

}
