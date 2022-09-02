package com.example.Mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Mapping.Repository.AuthenRepo;
import com.example.Mapping.bean.Authentication;

@Transactional
@SpringBootTest
class AuthenticationTest {
	

	Authentication auth;
	
	@BeforeEach
	void objectCreation()
	{
	    auth=new Authentication();
	    assertNotNull(auth);
	}
	

	@Test
	void test1() {
		auth.setUsername("praveen");
		auth.setPassword("praveen@123");
		
		assertEquals(auth.getUsername(), "praveen");
		assertEquals(auth.getPassword(),"praveen@123");
	}
	@Test
	void test2() {
				assertNotNull(auth.toString());
	}
	

}
