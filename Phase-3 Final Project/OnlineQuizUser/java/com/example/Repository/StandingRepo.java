package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bean.Standings;

public interface StandingRepo extends JpaRepository<Standings,Integer>{
	
	@Query("select s from Standings s order by s.score desc")
	public List<Standings> findByPos();

}
