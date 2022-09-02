package com.example.demo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Nested Test Example")
public class D_NestedTest {

	@Nested
	@DisplayName("Nested Class A")
	class A {
	
		@Test
		void test() {
			System.out.println("Nested class test method executed");
		}
		
	}
}