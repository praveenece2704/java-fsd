package com.example.Basics;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Basics.Jdbc.Persondao;
import com.example.Basics.bean.Persons;

//@SpringBootApplication
public class BasicsJdbCtoJpaApplication implements CommandLineRunner{

	private Logger log=LoggerFactory.getLogger(this.getClass());
	@Autowired
	Persondao dao;
	public static void main(String[] args) {
		SpringApplication.run(BasicsJdbCtoJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("All users-> {}",dao.findAll());
		log.info("User id is 10001->{}",dao.findbyId(10001));
		log.info("Delete id is 10001 No of rows deleted->{}",dao.deletebyId(10001));
		log.info("Inserting value ->{}",dao.insert(new Persons(10005,"Raj","Mettur")));
		log.info("Update value ->{}",dao.update(new Persons(10002,"Yuvi","Mecheri")));
	}

}
