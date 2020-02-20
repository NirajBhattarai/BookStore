package com.example.demo.service;

import com.example.demo.model.UserCredentials;

public interface UserCredentialsService {

	UserCredentials findUserByEmail(String email);

	void sendVerificationMail(UserCredentials userCredentials);

}
