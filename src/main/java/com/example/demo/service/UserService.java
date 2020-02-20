package com.example.demo.service;

import javax.validation.Valid;

import com.example.demo.dto.UserSignupForm;
import com.example.demo.model.UserCredentials;

public interface UserService {

	UserCredentials saveWhileUsingRegistration(@Valid UserSignupForm userSignupForm);

}
