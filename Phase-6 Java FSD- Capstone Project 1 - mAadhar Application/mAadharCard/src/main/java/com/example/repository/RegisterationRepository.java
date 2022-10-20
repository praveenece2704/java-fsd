package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Registration;

@Repository
public interface RegisterationRepository extends JpaRepository<Registration,String> {

	@Query("Select a from Registration a where a.email=?1")
	public Registration findByEmail(String string);

	@Query("Select a from Registration a where a.password=?1")
	public Registration findByPassword(String string);

	
	
}
