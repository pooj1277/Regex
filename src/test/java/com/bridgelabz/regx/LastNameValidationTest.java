package com.bridgelabz.regx;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LastNameValidationTest {

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest1() {
		LastNameValidation validator = new LastNameValidation();
		Boolean result = validator.lastNameValidation("Avhad");		
		assertTrue(result);
	}
	
	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest2() {
		LastNameValidation validator = new LastNameValidation();
		Boolean result = validator.lastNameValidation("AVHAD");		
		assertFalse(result);
	}
	
	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest3() {
		LastNameValidation validator = new LastNameValidation();
		Boolean result = validator.lastNameValidation("avhad");		
		assertFalse(result);
	}
}