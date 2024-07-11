package Esercizio_6_Test;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import Esercizio_6.*;

public class NotificationServiceTest {
	
	private SMSService smsMock;
	private EmailService emailMock;
	private NotificationService notificationService;
	private User user;
	
	@BeforeEach
	void setUp() {
		emailMock = mock(EmailService.class);
		smsMock = mock(SMSService.class);
		
		notificationService = new NotificationService(emailMock, smsMock);
	} 

	@Test
	public void sendNotificationTest00() {
		
		user = new User(null, null);

		notificationService.sendNotification(user, new String());

		Mockito.verify(emailMock, never()).sendEmail(Mockito.anyString(), Mockito.anyString());
		Mockito.verify(smsMock, never()).sendSMS(Mockito.anyString(), Mockito.anyString());
	}

	@Test
	public void sendNotificationTest01() {
		
		user = new User(null, "111 222 3333");

		notificationService.sendNotification(user, new String());

		Mockito.verify(emailMock, never()).sendEmail(Mockito.anyString(), Mockito.anyString());
		Mockito.verify(smsMock, times(1)).sendSMS(user.getPhonenumber(), new String());
	}

	@Test
	public void sendNotificationTest10() {
		
		user = new User("pippo@gmail.com", null);

		notificationService.sendNotification(user, new String());

		Mockito.verify(emailMock, times(1)).sendEmail(user.getEmail(), new String());
		Mockito.verify(smsMock, never()).sendSMS(Mockito.anyString(), Mockito.anyString());
	}

	@Test
	public void sendNotificationTest11() {

		user = new User("pippo@gmail.com", "111 222 3333");

		notificationService.sendNotification(user, new String());

		Mockito.verify(emailMock, times(1)).sendEmail(user.getEmail(), new String());
		Mockito.verify(smsMock, times(1)).sendSMS(user.getPhonenumber(), new String());
	}
}
