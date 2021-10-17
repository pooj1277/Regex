/*
 * Problem : As a User need to follow pre-defined Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number 
 * Author: Pooja Avhad
 */

package com.bridgelabz.regx;
import java.util.regex.Pattern;

public class MobileNumberValidation {	
	public static final String NUMBER_VALIDATION = "^[0-9]{2}[ ]{1}[0-9]{10}$";

	public boolean mobileNumberValidation(String mobNumber) {
		return Pattern.matches(NUMBER_VALIDATION, mobNumber);
	}
}