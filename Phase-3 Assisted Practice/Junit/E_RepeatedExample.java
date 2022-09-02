package com.example.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class E_RepeatedExample {

	Calculator c ;
	
	@BeforeEach
	void initEach() {
		c = new Calculator();
	}
	
	@Test
	@RepeatedTest(1000)
	void calculate() {
		int actual = c.calculate(1, 1);
		Assertions.assertEquals(2, actual);
	}
	
	
}