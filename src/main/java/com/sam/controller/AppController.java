package com.sam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {
	
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name, Model model){
		model.addAttribute("name",name.toUpperCase());
		return "hello";
	}
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
//	public static void main(String[] args) {
//		SpringApplication.run(AppController.class, args);
//	}
	
}
