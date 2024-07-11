package com.example.demo.model;

import jakarta.validation.constraints.*;

public class User {

	@Pattern(regexp = "[a-zA-Z\\s']{3,20}", message = "Incorrect firstname")
	private String firstname;
	@Pattern(regexp = "[a-zA-Z\\s']{3,20}", message = "Incorrect lastname")
	private String lastname;
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,20}", message = "Incorrect password")
	private String password;

	//@Min(value = 0, message = "Too inferior value")
	//@Max(value = 100, message = "Too superior value")

	/*
	public User(String firstname, String lastname, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}
	*/

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User: \nfirstname = " + firstname + ",\nlastname = " + lastname + ",\npassword = " + password + "\nADDED\n";
	}
	
	
}
