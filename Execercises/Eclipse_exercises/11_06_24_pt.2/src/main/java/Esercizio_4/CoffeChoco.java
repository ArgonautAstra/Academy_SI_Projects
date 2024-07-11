package Esercizio_4;

public class CoffeChoco extends CoffeDecorator{

	public CoffeChoco(Coffe coffe) {
		super(coffe);
	}

	public void whatCoffe() {
		coffe.whatCoffe();
		this.plus();
	}
	
	public void plus() {
		System.out.print(" + chocolate");
	}
	
}
