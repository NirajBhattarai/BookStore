package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSignupForm;
import com.example.demo.model.User;
import com.example.demo.model.UserCredentials;
import com.example.demo.repository.UserCredentialsRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.utils.PasswordEncoderUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserCredentialsRepository userCredentialsRepository;

	@Override
	public UserCredentials saveWhileUsingRegistration(@Valid UserSignupForm userSignupForm) {
		User user = new User();
		user = userRepository.save(user);
		UserCredentials userCredentials = new UserCredentials();
		userCredentials.setPrimaryEmail(userSignupForm.getEmail());
		userCredentials.setUserSecretPwd(PasswordEncoderUtil.encode(userSignupForm.getPassword()));
		userCredentials = userCredentialsRepository.save(userCredentials);
		return userCredentials;
	}

}
