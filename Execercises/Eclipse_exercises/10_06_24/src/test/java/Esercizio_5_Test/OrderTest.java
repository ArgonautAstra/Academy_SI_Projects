package Esercizio_5_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import Esercizio_5.Order;

public class OrderTest {
	
	Order order;
	
	@BeforeEach
	void setUp() {
		order = new Order(15.75);
	}

	@Test
	public void getAmountTest() {
		assertEquals(15.75, order.getAmount(), "Valore non corrispondente"); 
	}
}
