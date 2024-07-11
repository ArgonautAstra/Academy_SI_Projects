package Esercizio_3;

public abstract class PaymentMethod {

	protected int accountNumber;
	protected double balance;
	
	public PaymentMethod() {}
	
	public PaymentMethod(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract boolean processPayment(double amount);
	
}
