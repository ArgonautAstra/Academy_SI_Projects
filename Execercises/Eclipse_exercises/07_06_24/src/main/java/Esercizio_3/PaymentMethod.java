package Esercizio_3;

public abstract class PaymentMethod {

	protected int accountNumber;
	protected double balance;
	
	public PaymentMethod() {}
	
	public PaymentMethod(int accountNumber, double balance) throws InvalidUserException, NegativeBalanceException{
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(int accountNumber) throws InvalidUserException{
		if(accountNumber > 0)
			this.accountNumber = accountNumber;
		else
			throw new InvalidUserException();
	}

	public void setBalance(double balance) throws NegativeBalanceException{
		if(balance > 0)
			this.balance = balance;
		else
			throw new NegativeBalanceException();
	}

	public abstract boolean processPayment(double amount);
	
}
