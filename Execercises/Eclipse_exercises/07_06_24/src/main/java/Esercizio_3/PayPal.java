package Esercizio_3;

public class PayPal extends PaymentMethod {

	public PayPal() {
		super();
	}
	
	public PayPal(int accountNumber, double balance) throws InvalidUserException, NegativeBalanceException{
		super(accountNumber,balance);
	}

	public boolean processPayment(double amount) {
		if(balance < amount) {
			System.out.println("Credito Paypal insufficiente");
			return false;
		}else{
			balance -= amount;
			System.out.println("Acquisto effettuato tramite Paypal");
			return true;
		}
	}

}
