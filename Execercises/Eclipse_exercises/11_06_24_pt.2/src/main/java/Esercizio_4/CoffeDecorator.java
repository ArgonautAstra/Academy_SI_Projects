package Esercizio_4;

public abstract class CoffeDecorator implements Coffe{

	protected Coffe coffe;
	
	public CoffeDecorator(Coffe coffe) {
		this.coffe = coffe;
	}

	public void whatCoffe() {
		coffe.whatCoffe();
	}

}
