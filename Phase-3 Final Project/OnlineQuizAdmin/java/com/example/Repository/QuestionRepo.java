package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Question;

public interface QuestionRepo extends JpaRepository<Question,Integer>{

}
