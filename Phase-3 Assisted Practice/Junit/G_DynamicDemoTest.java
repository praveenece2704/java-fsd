package com.example.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class G_DynamicDemoTest {

	@TestFactory
	Collection<DynamicTest> dynamicTest() {
		Collection<DynamicTest> tests = new ArrayList<DynamicTest>();
		
		tests.add(DynamicTest.dynamicTest("This is Test method", () -> {Assertions.assertTrue(true);}));
		tests.add(DynamicTest.dynamicTest ("This is Test1 method", () -> {Assertions.assertTrue(true);}));
		
		tests.add(DynamicTest.dynamicTest("This one from Lambda", new TestExeutable()));
		
		return tests;
	}
}

class TestExeutable implements Executable {

	@Override
	public void execute() throws Throwable {
		System.out.println("This is without lambda expression");
		
	}
	
}