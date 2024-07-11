package Esercizio_3;

public class InvalidUserException extends Exception{
	
	private static final long serialVersionUID = 2L;

	public InvalidUserException() {
		super("Problema con l'inserimento dell'utente");
	}

	@Override
	public String toString() {
		return getMessage() + ": inserimento errato dell'ID utente!";
	}
}
