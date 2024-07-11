package Esercizio_1;

import java.io.Serializable;

public class UserSingleton implements Serializable{

	private static final long serialVersionUID = 1L;

	private static UserSingleton instance;
	
	private String firstname, lastname;
	
	public UserSingleton() {}
	
	public UserSingleton getIstance() {
		if(instance == null)
			instance = new UserSingleton();
		
		return instance;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
