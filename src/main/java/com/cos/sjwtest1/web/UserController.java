package com.cos.sjwtest1.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.sjwtest1.domain.user.User;
import com.cos.sjwtest1.domain.user.UserRepository;
import com.cos.sjwtest1.web.dto.JoinReqDto;
import com.cos.sjwtest1.web.dto.LoginReqDto;




@Controller
public class UserController {
	//userrepository
	private UserRepository userRepository;
	//session
	private HttpSession session;
	
	
	//DI
	public UserController(UserRepository userRepository, HttpSession session) {
		this.userRepository = userRepository;
		this.session	=	session;
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
	
	
	@PostMapping("login")
	String login(LoginReqDto dto) {
		System.out.println(dto.getUsername());
		System.out.println(dto.getPassword());
		
		User userEntity = userRepository.mLogin(dto.getUsername(), dto.getPassword());
		
		if(userEntity==null) {
			
			return "redirect:/loginForm";
		} else {
			session.setAttribute("principal", userEntity);
			return "redirect:/home";
		}
		
		
	}
}
