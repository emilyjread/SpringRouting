package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	public static void main(String[] args) {
		SpringApplication.run(HellospringApplication.class, args);
	}
	//Strings Assignment
	
	@RequestMapping("/")
	public String hello() {
		return "Hello there! Have a great day!";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "SpringBoot is great! So easy to just respond with strings!";
	}
	
	//getting familiar with routing assignment
	
	@RequestMapping("/coding")
	public String helloCD() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public String java() {
		return "Java/Spring is better";
	}

}
