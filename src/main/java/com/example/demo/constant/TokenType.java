package com.example.demo.constant;

public enum TokenType {
	REGISTRATION("registration"), AUTHENTICATION("authentication"), FORGOT_PASSWORD("forget_password"),
	EMAIL_UPDATE("email_update"), TWOFA("2fa"), RESET_PASSWORD("reset_password"),
	UNAUTHORIZED_LOGIN("unauthorized_login");

	private String type;

	private TokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getTokenType() {
		return type;
	}
}
