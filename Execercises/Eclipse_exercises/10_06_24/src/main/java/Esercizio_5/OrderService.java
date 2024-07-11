package Esercizio_5;
	
public class OrderService{
	
	private OrderRepository orderRepository;
	private PaymentService paymentService;
	
	public OrderService (OrderRepository orderRepository, PaymentService paymentService ) {
		this.orderRepository = orderRepository;
		this.paymentService = paymentService;
	}
	
	public boolean placeOrder(Order order) {
		
		boolean paymentSuccessful = paymentService.processPayment(order.getAmount());

		if (paymentSuccessful) {	
			orderRepository.save(order);
			return true;
		}
		
		return false;
	}
	
}

