package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.BookRepository;
import com.example.bean.Book;

@RestController
public class IndexController {
	
	@Autowired
	BookRepository brep;
	
	@GetMapping("/")
	public List<Book> show()
	{	
		return brep.findAll();
	}
	@GetMapping("/{id}")
	public Book showbyid(@PathVariable("id") int id)
	{	
		return brep.findById(id).orElse(null);
	}
	

}
