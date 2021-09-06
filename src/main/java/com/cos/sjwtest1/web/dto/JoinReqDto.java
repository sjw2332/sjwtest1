package com.cos.sjwtest1.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinReqDto {
	private String username;
	private String password;
	private String email;
}
