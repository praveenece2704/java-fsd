package com.example.demo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class A_UnderstandAnnotation {

	@BeforeAll
	static void initAll() {
		System.out.println("Before All is invoked");
	}
	
	@BeforeEach
	void init() {
		System.out.println("BeforeEach invoked");
	}
	
	
	@Test
	void test() {
		System.out.println("Test1 execution ");
	}
	
	@Test
	void test2() {
		System.out.println("Test2 execution ");
	}
	
	
	
	@AfterEach
	void after() {
		System.out.println("AfterEach invoked");
	}
	
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All is invoked");
	}
	
}