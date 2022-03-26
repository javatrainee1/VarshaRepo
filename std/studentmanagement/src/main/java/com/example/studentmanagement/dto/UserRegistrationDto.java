package com.example.studentmanagement.dto;

public class UserRegistrationDto {
	private String firstName;
	private String lastName;
	private String email;
	
	private String courseName;
	private String fees;
	
	private String password;
	private String Address;
	
	public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String firstName, String lastName, String email, String password,String Address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.courseName = courseName;
		this.fees = fees;
		this.email = email;
		this.password = password;
		this.Address=Address;
	}
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
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
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	
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