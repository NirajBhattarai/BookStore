package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.constant.TokenType;
import com.example.demo.model.AuthenticationToken;
import com.example.demo.model.UserCredentials;
import com.example.demo.repository.UserCredentialsRepository;
import com.example.demo.utils.TokenGenerator;

public class UserCredentialsServiceImpl implements UserCredentialsService {

	@Autowired
	private UserCredentialsRepository userCredentialsRepository;

	@Override
	public UserCredentials findUserByEmail(String email) {
		UserCredentials userCredentials = userCredentialsRepository.findByPrimaryEmail(email);
		return userCredentials;
	}

	@Override
	public void sendVerificationMail(UserCredentials userCredentials) {
		AuthenticationToken authenticationToken = new AuthenticationToken();
		authenticationToken.setUser(userCredentials.getUser());
		authenticationToken.setToken(TokenGenerator.generateToken());
		authenticationToken.setTokenType(TokenType.REGISTRATION);
		

	}

}
