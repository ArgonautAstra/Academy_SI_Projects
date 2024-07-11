package Esercizio_2;

import java.util.ArrayList;

import Esercizio_2.EmailService.*;
import Esercizio_2.NotificationService.*;

public class Main {

	public static void main(String[] args) {
		
		//EMAIL
		
		ArrayList<EmailFactory> emailDB = new ArrayList<>();

		emailDB.add(new GmailEmailFactory("mariorossi@gmail.com"));
		emailDB.add(new GmailEmailFactory("luigiverdi@gmail.com"));
		emailDB.add(new OutlookEmailFactory("mariorossi@outlook.com"));
		emailDB.add(new OutlookEmailFactory("luigiverdi@outlook.com"));
		
		for(EmailFactory item : emailDB)
			System.out.println(item.getEmail());
		
		System.out.println("");
		
		NotificationFactory emailService;
		
		for(EmailFactory item : emailDB) {
			emailService = new EmailNotificationFactory(item);
			emailService.sendMessage("111222333@fake.lol", "Hello world! By E-Mail\n");
		}
		
		//NUMBER
		//Si può replicare la Factory Method con i numeri di telefono e i servizi telefonici
		
		ArrayList<String> numberDB = new ArrayList<>();

		numberDB.add("111 111 1111");
		numberDB.add("222 222 2222");
		numberDB.add("333 333 3333");
		numberDB.add("444 444 4444");
		
		for(String item : numberDB)
			System.out.println(item);
		
		System.out.println("");

		NotificationFactory smsService;
		
		for(String item : numberDB) {
			smsService = new SMSNotificationFactory(item);
			smsService.sendMessage("111 222 333", "Hello world! By SMS\n");
		}
	}

}
