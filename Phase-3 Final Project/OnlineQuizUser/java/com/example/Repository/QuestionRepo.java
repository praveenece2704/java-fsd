package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bean.Question;


public interface QuestionRepo extends JpaRepository<Question,Integer>{
	
	@Query("Select a from Question a where a.answer=?1")
	public Question findByAnswer(String answer);

}
