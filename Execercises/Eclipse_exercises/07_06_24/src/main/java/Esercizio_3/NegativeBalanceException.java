package Esercizio_3;

public class NegativeBalanceException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NegativeBalanceException() {
		super("Problema con l'inserimento del bilancio");
	}

	@Override
	public String toString() {
		return getMessage() + ": un bilancio non può essere negativo!";
	}
}
