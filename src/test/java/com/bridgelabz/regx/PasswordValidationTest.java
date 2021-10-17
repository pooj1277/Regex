package com.bridgelabz.regx;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordValidationTest {
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestR1A() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("PoojAvhad");		
		assertTrue(result);
	}
	
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestR1B() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("Pooja");		
		assertFalse(result);
	}
	
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestR1C() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("Qwertyui");		
		assertTrue(result);
	}

}
