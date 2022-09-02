package com.example.demo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class F_DependencyInjection {

	
	@Test
	@DisplayName("This is test displayname")
	void test(TestInfo testInfo, TestReporter testReporter) {
		testReporter.publishEntry("Hello World! "+testInfo.getDisplayName());
		
	}
}

// TestInfo - Represents Test information for currently running test case
// TestReporter - Publish entries on console