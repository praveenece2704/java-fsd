package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Registration {

	@Id
	private String mobile;
	private String email;
	private String password;
	private String name;
	private String dob;
	private String passportId;
	private String address;


	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String mobile, String name, String dob, String passportId, String address, String email,
			String password) {
		super();
		this.mobile = mobile;
		this.name = name;
		this.dob = dob;
		this.passportId = passportId;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Registration [mobile=" + mobile + ", name=" + name + ", dob=" + dob + ", passportId=" + passportId
				+ ", address=" + address + ", email=" + email + ", password=" + password + "]";
	}

}
