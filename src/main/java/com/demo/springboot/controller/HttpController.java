package com.demo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpController {

	@GetMapping("/")
	public String indexController() {
		return "index";
	}
	
	@GetMapping("/redirect")
	public String redirectTestController() {
		return "redirect:/";
	}
	
}
