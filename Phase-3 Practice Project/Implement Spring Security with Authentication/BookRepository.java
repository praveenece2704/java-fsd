package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	
     List<Book>  findByYear(String year);

}
