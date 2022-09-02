package com.example.Mapping;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class simpleTest {
	
	SimpleAuthentication sa;
	
	@BeforeEach
	void objectCreation()
	{
		sa=new SimpleAuthentication();
	}

	@Test
	void test1() {
		
		boolean val = sa.validate("praveen", "praveen@123");
		assertTrue(val);
	}
	@Test
	void test2() {
		
		boolean val = sa.validate("praveenkumar", "praveen@123");
		assertFalse(val);
	}
	@Test
	void validatename() {
		
		boolean val = sa.validatename("Praveen12");
		assertTrue(val);
	}
	@Test
	void validatepass() {
		
		boolean val = sa.validatepassword("Praveen@123");
		assertTrue(val);
	}
}
