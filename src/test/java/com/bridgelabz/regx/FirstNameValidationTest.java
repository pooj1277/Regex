/*
 * Problem : As a User need to enter a valid First Name - First name starts with Cap and has minimum 3 characters
 * Author: Pooja Avhad
 */

package com.bridgelabz.regx;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FirstNameValidationTest {

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest1() {
		FirstNameValidation validator = new FirstNameValidation();
		Boolean result = validator.firstNameValidation("Pooja");		
		assertTrue(result);
	}
	
	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest2() {
		FirstNameValidation validator = new FirstNameValidation();
		Boolean result = validator.firstNameValidation("POOJA");		
		assertFalse(result);
	}
	
	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest3() {
		FirstNameValidation validator = new FirstNameValidation();
		Boolean result = validator.firstNameValidation("pooja");		
		assertFalse(result);
	}
}