package Esercizio_5_Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import Esercizio_5.*;
import Esercizio_5.Order;

public class OrderServiceTest {
	
	private OrderService orderService;
	private OrderRepository repositoryMock;
	private PaymentService paymentMock;
	private Order orderMock;
	
	@BeforeEach
	void setUp() {
		repositoryMock = mock(OrderRepository.class);
		paymentMock = mock(PaymentService.class);
		orderMock = mock(Order.class);
		
		Mockito.when(paymentMock.processPayment(orderMock.getAmount())).thenReturn(true);
		
		orderService = new OrderService(repositoryMock, paymentMock);
	}

	@Test
	public void placeOrderTest() {
		assertTrue(orderService.placeOrder(orderMock)); 
	}
}
