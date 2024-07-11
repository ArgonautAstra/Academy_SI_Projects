package Esercizio_2.EmailService;

import java.util.regex.Pattern;

public class GmailEmailFactory extends EmailFactory {

	public GmailEmailFactory(String email) {
		super(Pattern.matches("[a-zA-Z]+@gmail.com", email) ? email : null);
	}

	public String getEmail(){
		return super.getEmail();
	}
	
	public void servizioGmail1() {}
	
	public void servizioGmail2() {}
	
	public void servizioGmail3() {}
}
