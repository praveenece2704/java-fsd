package com.example.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bean.Admin;

public interface AdminRepo extends CrudRepository<Admin,String> {

	@Query("Select a from Admin a where a.username=?1")
	public Admin findByName(String username);
	
	@Query("Select a from Admin a where a.password=?1")
	public Admin findByPassword(String password);
}
