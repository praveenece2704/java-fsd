package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Quiz;

public interface quizRepo extends JpaRepository<Quiz,Integer>{

	

}
