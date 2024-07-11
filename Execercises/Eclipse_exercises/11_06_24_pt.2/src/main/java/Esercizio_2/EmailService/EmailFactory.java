package Esercizio_2.EmailService;

public abstract class EmailFactory {
	
	String email;
	
	public EmailFactory(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}
