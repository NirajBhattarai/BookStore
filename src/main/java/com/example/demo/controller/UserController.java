package com.example.demo.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.UrlConstant;
import com.example.demo.dto.UserSignupForm;
import com.example.demo.model.UserCredentials;
import com.example.demo.service.UserCredentialsService;
import com.example.demo.service.UserService;
import com.example.demo.utils.ResponseHandler;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping(UrlConstant.USER)
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserCredentialsService userCredentialsService;

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public ResponseEntity<Object> registerConsumer(@Valid @RequestBody UserSignupForm userSignupForm,
			BindingResult result, HttpServletRequest request) {

		UserCredentials userCredentials = userCredentialsService.findUserByEmail(userSignupForm.getEmail());
		if (Objects.nonNull(userCredentials)
				&& Objects.nonNull(userCredentials.getUser().getIsUserRegistered().booleanValue())) {
			return ResponseHandler.response(HttpStatus.BAD_REQUEST, true, "User Already Registered",
					userCredentials.getPrimaryEmail());
		}

		userCredentials = userService.saveWhileUsingRegistration(userSignupForm);
		userCredentialsService.sendVerificationMail(userCredentials);
		return ResponseHandler.response(HttpStatus.OK, false, "User Registered", userCredentials.getPrimaryEmail());
	}

}
