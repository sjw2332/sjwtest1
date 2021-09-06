package com.cos.sjwtest1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/home")
	String home() {
		return "home";
	}

	@GetMapping("/joinForm")
	String joinForm() {
		return "user/joinForm";
	}
	@GetMapping("/loginForm")
	String loginForm() {
		return "user/loginForm";
	}
}
