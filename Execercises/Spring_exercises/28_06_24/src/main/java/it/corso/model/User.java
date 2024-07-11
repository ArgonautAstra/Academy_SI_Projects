package it.corso.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "firstname")
	@Pattern(regexp = "[a-zA-Z\\èàùìò]{1,50}", message = "Incorrect firstname")
	private String firstname;
	
	@Column(name = "lastname")
	@Pattern(regexp = "[a-zA-Z\\èàùìò]{1,50}", message = "Incorrect lastname")
	private String lastname;

	@Column(name = "email")
	@Pattern(regexp = "[A-z0-9\\.\\+_-]+@[A-z0-9\\._-]+\\.[A-z]{2,8}", message = "Incorrect email")
	private String email;

	@Column(name = "password")
	// @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,20}", message = "Incorrect password")
	private String password;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<Order> orders = new ArrayList<>();

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
	
	public List<Order> getOrders() {
		return orders;
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

	public void setOrders(List<Order> orders) {
		this.orders = orders;
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
