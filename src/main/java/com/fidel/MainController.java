package com.fidel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/secured")
	public String secured(){
		System.out.println("Inside secured()");
		return "Hello user !!! : " + new Date();
	}
}
