package com.cos.sjwtest1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.sjwtest1.domain.user.User;
import com.cos.sjwtest1.domain.user.UserRepository;
import com.cos.sjwtest1.web.dto.JoinReqDto;




@Controller
public class UserController {
	
	private UserRepository userRepository;
	
	
	//DI
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	
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

	@PostMapping("/join")
	String join(JoinReqDto dto) {
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setEmail(dto.getEmail());
		
		userRepository.save(user);
		
		
		return "redirect:/loginForm";
	}
}
