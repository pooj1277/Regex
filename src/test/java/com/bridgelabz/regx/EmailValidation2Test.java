/*
 * Problem : As a User need to enter a valid email - Should clear all email samples provided separately 
 * Author: Pooja Avhad
 */
package com.bridgelabz.regx;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class EmailValidation2Test {
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA1() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc@yahoo.com");		
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA2() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc-100@yahoo.com");		
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA3() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc.100@yahoo.com");		
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA4() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc111@abc.com");		
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA5() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc-100@abc.net");		
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA6() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc.100@abc.com.au");		
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA7() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc@1.com");		
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA8() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc@gmail.com.com");		
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestA9() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc+100@gmail.com");		
		assertTrue(result);
	}
	//B : INVALID EMAILS
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB1() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB2() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc@.com.my");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB3() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc123@gmail.a");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB4() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc123@.com");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB5() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc123@.com.com");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB6() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2(".abc@abc.com");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB7() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc()*@gmail.com");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB8() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc@%*.com");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB9() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc.2002@gmail.com");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB10() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc.@gmail.com");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB11() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc@abc@gmail.com");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB12() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc@gmail.com.1a");		
		assertFalse(result);
	}
	
	@Test
	public void whenEnteredEmailShouldValidateAndPassEmailTestB13() {
		EmailValidation2 validator = new EmailValidation2();
		Boolean result = validator.emailValidation2("abc@gmail.com.aa.au");		
		assertFalse(result);
	}
}
