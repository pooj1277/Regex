/*
 * Problem : As a User need to enter a valid email - Should clear all email samples provided separately 
 * Author: Pooja Avhad
 */
package com.bridgelabz.regx;
import java.util.regex.Pattern;

public class EmailValidation2{		
	public static final String EMAIL_VALIDATION = "^(?!\\.)(?!.*?\\.\\.)(.+)@[^\\.][\\w.-]*[a-zA-Z0-9-]+(\\.)[a-z]{2,}+(\\.[a-z]{2,})*$";
	public Boolean emailValidation2(String email) {
		return Pattern.matches(EMAIL_VALIDATION, email);
	}
}


//[^\\.](?!.*?\\.\\.)