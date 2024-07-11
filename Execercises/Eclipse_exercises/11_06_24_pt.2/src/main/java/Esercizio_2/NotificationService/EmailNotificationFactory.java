package Esercizio_2.NotificationService;

import Esercizio_2.EmailService.EmailFactory;

public class EmailNotificationFactory implements NotificationFactory{

	EmailFactory email;
	
	public EmailNotificationFactory(EmailFactory email) {
		this.email = email;
	}

	public String getEmail() {
		return email.getEmail();
	}
	
	public void sendMessage(String email, String message) {
		System.out.println("Send by " + this.email.getEmail() + ", to: " + email + "\nMessage: " + message);
	}
}
