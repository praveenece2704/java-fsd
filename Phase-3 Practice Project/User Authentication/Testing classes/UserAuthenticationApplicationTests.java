package com.example.Mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Mapping.Repository.AuthenRepo;
import com.example.Mapping.bean.Authentication;

@SpringBootTest
class UserAuthenticationApplicationTests {
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	AuthenRepo aurep;

	@Test
	void countUsers() {
		
		assertNotNull(aurep.count());
		
	}
	
	@Test
	void  countAvailable()
	{
		assertNotEquals(0,aurep.count());
	}
	@Test
	void  count()
	{
		aurep.save(new Authentication("Ramya","12345"));
		assertEquals(4,aurep.count());
	}
	@Test 
	public void findalluser() {
		 log.info("all users-------------->{}",aurep.findById("praveen"));
		 
	}
	
	@Test
	public void findbyid() {
		Authentication u=aurep.findById("praveen").orElse(null);
		assertNotNull(u);
				
	}
	@Test
	public void findbyname() {
	
		assertNotNull(aurep.findByUsername("praveen"));
				
	}
	
}
