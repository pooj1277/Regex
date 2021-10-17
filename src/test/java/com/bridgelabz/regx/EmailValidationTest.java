/*
 * Problem : As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions 
 * Author: Pooja Avhad
 */
package com.bridgelabz.regx;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EmailValidationTest {
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTest1() {
		EmailValidation validator = new EmailValidation();
		Boolean result = validator.emailValidation("abc.xyz@bl.co.in");		
		assertTrue(result);
	}	
}
