package Esercizio_5;

public class ContoCorrenteConstructorException extends Exception{

	private static final long serialVersionUID = 1L;
	private String message;
	
	public ContoCorrenteConstructorException(String message) {
		super(message);
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}
	
	

}
