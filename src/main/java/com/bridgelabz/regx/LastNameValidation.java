/*
 * Problem : As a User need to enter a valid Last Name - Last name starts with Cap and has minimum 3 characters
 * Author: Pooja Avhad
 */

package com.bridgelabz.regx;
import java.util.regex.Pattern;

public class LastNameValidation {
	public static final String LAST_NAME_VALIDATION = "^[A-Z]{1}[a-z]{2,}$";

	public boolean lastNameValidation(String lastName) {
		return Pattern.matches(LAST_NAME_VALIDATION, lastName);
	}
}
