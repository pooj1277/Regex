/*
 * Problem : As a User need to enter a valid First Name - First name starts with Cap and has minimum 3 characters
 * Author: Pooja Avhad
 */

package com.bridgelabz.regx;
import java.util.regex.Pattern;

public class FirstNameValidation {
	public static final String NAME_VALIDATION = "^[A-Z]{1}[a-z]{2,}$";

	public boolean firstNameValidation(String firstName) {
		return Pattern.matches(NAME_VALIDATION, firstName);
	}
}
