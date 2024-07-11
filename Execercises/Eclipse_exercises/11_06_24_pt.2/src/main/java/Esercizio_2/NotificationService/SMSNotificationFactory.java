package Esercizio_2.NotificationService;

public class SMSNotificationFactory implements NotificationFactory{

	String number;

	public SMSNotificationFactory(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void sendMessage(String number, String message) {
		System.out.println("Send by " + this.number + ", to: " + number + "\nMessage: " + message);
	}

}
