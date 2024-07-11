package Esercizio_2.EmailService;

import java.util.regex.Pattern;

public class OutlookEmailFactory extends EmailFactory {
	
	public OutlookEmailFactory(String email) {
		super(Pattern.matches("[a-zA-Z]+@outlook.com", email) ? email : null);
	}

	public String getEmail(){
		return super.getEmail();
	}
	
	public void servizioOutlook1() {}
	
	public void servizioOutlook2() {}
	
	public void servizioOutlook3() {}
}
