package com.example.demo.utils;

import java.security.SecureRandom;
import java.util.Objects;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.constant.UrlConstant;

@Service
public class PasswordEncoderUtil {

	private static PasswordEncoder passwordEncoder = null;

	public static void create() {
		passwordEncoder = new BCryptPasswordEncoder(4, new SecureRandom(UrlConstant.TOKEN_SECRET.getBytes()));
	}

	public static String encode(String password) {
		if (Objects.isNull(passwordEncoder))
			create();
		return passwordEncoder.encode(password);
	}

	public Boolean matches(String rawPassword, String encodedPassword) {
		if (Objects.isNull(passwordEncoder))
			create();
		return passwordEncoder.matches(rawPassword, encodedPassword);
	}

}
