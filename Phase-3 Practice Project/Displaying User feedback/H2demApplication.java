package com.example.Mapping;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Mapping.Repository.VehicleRepository;
import com.example.Mapping.bean.Vehicle;

@SpringBootApplication
public class H2demApplication {
	
//	private Logger log=LoggerFactory.getLogger(this.getClass());
//	
//	@Autowired
//     VehicleRepository verepo;
	public static void main(String[] args) {
		SpringApplication.run(H2demApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		log.info("-------->{}",verepo.save(new Vehicle("Bolero",4553)));*/
		
//	}

}
