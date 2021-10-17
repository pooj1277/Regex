/*
 * Problem : As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions 
 * Author: Pooja Avhad.
 */
package com.bridgelabz.regx;
import java.util.regex.Pattern;

public class EmailValidation {	
	public static final String EMAIL_VALIDATION = "^[a-z]+(\\.[a-zA-Z0-9]+)@bl(\\.)co(\\.)in$";	
	public Boolean emailValidation(String email) {
		return Pattern.matches(EMAIL_VALIDATION, email);
	}	
}
