package com.example.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ApplicationDetails {
	
	@Id
	private String email;
	private String firstName;
	private String lastName;
	private String address;
	private String dob;
	private int age;
	private String panNo;
	private long citizenId;
	private long passportId;
	private String issueDate;
	private String currentStatus;
	private long applicationId;
	private String dateofApplication;
	private String gender;
	private String aadharNo;
	public ApplicationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplicationDetails(String email, String firstName, String lastName, String address, String dob, int age,
			String panNo, long citizenId, long passportId, String issueDate, String currentStatus, long applicationId,
			String dateofApplication, String gender, String aadharNo) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
		this.age = age;
		this.panNo = panNo;
		this.citizenId = citizenId;
		this.passportId = passportId;
		this.issueDate = issueDate;
		this.currentStatus = currentStatus;
		this.applicationId = applicationId;
		this.dateofApplication = dateofApplication;
		this.gender = gender;
		this.aadharNo = aadharNo;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	@Override
	public String toString() {
		return "ApplicationDetails [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", dob=" + dob + ", age=" + age + ", panNo=" + panNo + ", citizenId="
				+ citizenId + ", passportId=" + passportId + ", issueDate=" + issueDate + ", currentStatus="
				+ currentStatus + ", applicationId=" + applicationId + ", dateofApplication=" + dateofApplication
				+ ", gender=" + gender + ", aadharNo=" + aadharNo + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public long getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(long citizenId) {
		this.citizenId = citizenId;
	}
	public long getPassportId() {
		return passportId;
	}
	public void setPassportId(long passportId) {
		this.passportId = passportId;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public long getApplicationId() {
		return applicationId+(long)(Math.random()*(9000-1000+1)+1000);
	}
	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId+(long)(Math.random()*(9000-1000+1)+1000);   
	}
	public String getDateofApplication() {
		return dateofApplication;
	}
	public void setDateofApplication(String dataapp) {
		this.dateofApplication = dataapp;
	}
	public String getGender() {
		return gender;
		
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
