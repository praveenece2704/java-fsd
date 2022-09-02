package com.example.Mapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Mapping.Repository.AuthenRepo;

@SpringBootApplication
public class UserAuthenticationApplication implements CommandLineRunner{
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	@Autowired
	AuthenRepo arep;

	public static void main(String[] args) {
		SpringApplication.run(UserAuthenticationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("{}",arep.findById("praveen"));
		
		
	}

}
