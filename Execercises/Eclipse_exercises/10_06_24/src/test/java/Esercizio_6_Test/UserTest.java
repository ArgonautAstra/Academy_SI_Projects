package Esercizio_6_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import Esercizio_6.User;

public class UserTest {
	
	User user;
	
	@BeforeEach
	void setUp() {
		user = new User("pippo@gmail.com","111 222 3333");
	}

	@Test
	public void getEmailTest() {
		assertEquals("pippo@gmail.com", user.getEmail(), "Email non corrispondente"); 
	}

	@Test
	public void getPhonenumberTest() {
		assertEquals("111 222 3333", user.getPhonenumber(), "Numero telefonico non corrispondente"); 
	}
}
