package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserLogin {
	
	@Id
	private String mobile;
	private String email;
	private String password;
	
	
	public UserLogin(String mobile, String email, String password) {
		super();
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Login [mobile=" + mobile + ", email=" + email + ", password=" + password + "]";
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
