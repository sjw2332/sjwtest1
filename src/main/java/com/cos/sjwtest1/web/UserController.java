package com.cos.sjwtest1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/home")
	String home() {
		return "home";
	}
}
