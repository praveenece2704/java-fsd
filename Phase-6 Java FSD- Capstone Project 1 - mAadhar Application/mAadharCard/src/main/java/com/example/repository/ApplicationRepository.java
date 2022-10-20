package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.ApplicationDetails;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationDetails,String> {

	@Query("Select a.firstName,a.lastName,a.citizenId,a.currentStatus from ApplicationDetails a where a.email=?1 ")
	public Object findByCurrentStatus(String email);

	@Query("Select a.firstName,a.lastName,a.citizenId from ApplicationDetails a where a.currentStatus='Not Approved'")
	public List<Object> findByStatus();

}
