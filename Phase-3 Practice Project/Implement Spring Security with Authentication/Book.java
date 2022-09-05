package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Book {
	
	@Id
	private int id;
	
	private String title;
	
	private String description;

	private String year;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id,String title, String description, String year) {
		super();
		this.id=id;
		this.title = title;
		this.description = description;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", year=" + year + "]";
	}
	
	

}
