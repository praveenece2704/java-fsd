package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bean.User;

public interface UserRepo extends JpaRepository<User,Integer> {

	@Query("Select a from User a where a.username=?1")
	public User findByName(String username);
	
	@Query("Select a from User a where a.password=?1")
	public User findByPassword(String password);
}
