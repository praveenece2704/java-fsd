package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bean.Score;

public interface ScoreRepo extends JpaRepository<Score,Integer>{
	
	@Query("Select count(*) from Score a where a.correct=1 and a.userid=?1")
	public int findByCorrect(int id);


}
