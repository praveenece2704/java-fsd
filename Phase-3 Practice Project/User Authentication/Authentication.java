package com.example.Mapping.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Authentication {	
	@Id
	private String username;
	@Column(nullable=false)
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Authentication(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Authentication() {
		super();
		
	}
	@Override
	public String toString() {
		return "Authentication [username=" + username + ", password=" + password + "]";
	}
}
