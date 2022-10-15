package com.example.SearchAndUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserD {

	@Id
	private int id;
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "UserD [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
