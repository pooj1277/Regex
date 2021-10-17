package com.bridgelabz.regx;

import java.util.regex.Pattern;

public class PasswordValidation {
	public static final String PASSWORD_VALIDATION = "^[A-Za-z]{8,15}$";

	public boolean passwordValidation(String password) {
		return Pattern.matches(PASSWORD_VALIDATION, password);
	}
}
