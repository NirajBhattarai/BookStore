package com.example.demo.dto;

import javax.validation.constraints.NotBlank;

public class UserSignupForm {

	@NotBlank(message = "Please enter email id")
	private String email;

	private String password;

	private String confirmPassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
