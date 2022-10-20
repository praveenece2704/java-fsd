package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.AdminLogin;

@Repository
public interface AdminRepository extends JpaRepository<AdminLogin,String> {

	@Query("Select a from AdminLogin a where a.password=?1")
	public Optional<AdminLogin> findByPassword(String password);//error 



}
