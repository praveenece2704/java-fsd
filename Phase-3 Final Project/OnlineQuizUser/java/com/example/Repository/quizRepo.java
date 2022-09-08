package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Quiz;

public interface quizRepo extends JpaRepository<Quiz,Integer>{

	

}
