/*
 * Problem : As a User need to follow pre-defined Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number 
 * Author: Pooja Avhad
 */
package com.bridgelabz.regx;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class MobileNumberValidationTest {
	@Test
	public void whenEnteredMobileShouldValidateAndPassNumberTest1() {
		MobileNumberValidation validator = new MobileNumberValidation();
		Boolean result = validator.mobileNumberValidation("91 7577066080");
		
		assertTrue(result);
	}
}
