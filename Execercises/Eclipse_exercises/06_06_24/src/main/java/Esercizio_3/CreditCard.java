package Esercizio_3;

public class CreditCard extends PaymentMethod {

	public CreditCard() {
		super();
	}
	
	public CreditCard(int accountNumber, double balance) {
		super(accountNumber,balance);
	}
	
	public boolean processPayment(double amount) {
		if(balance < amount) {
			System.out.println("Và travagghia");
			return false;
		}else{
			balance -= amount;
			System.out.println("Acquisto effettuato tramite Carta di credito");
			return true;
		}
	}

}
