package com.example.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class B_AssertionExample {

	@Test
	void test() {

		Assertions.assertTrue(true);
		Assertions.assertFalse(false);
		
		String str = null;
		String str1 = "Dhruvik";
		
		Assertions.assertNotSame(str, str1);
		Assertions.assertNull(str);
		
		String[] a1  = {"A", "B"};
		String[] a2 = {"A","B"};
		
		Assertions.assertArrayEquals(a1, a2);
	}

}