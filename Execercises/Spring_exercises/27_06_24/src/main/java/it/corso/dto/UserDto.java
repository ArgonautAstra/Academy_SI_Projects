package it.corso.dto;

import java.util.List;

public class UserDto {
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	// Riferimento di User verso Order in DTO
	private List<UserOrderDto> order;

	public int getId() {
		return id;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	

	public List<UserOrderDto> getList() {
		return order;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setList(List<UserOrderDto> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "\nArticle{"
				+ "\nid_article = " + id
				+ ",\nfirstname = " + firstname 
				+ ",\nlastname = " + lastname 
				+ ",\nemail = " + email
				+ ",\npassword = " + password
				+ "}\n";
	}
	
	
}
