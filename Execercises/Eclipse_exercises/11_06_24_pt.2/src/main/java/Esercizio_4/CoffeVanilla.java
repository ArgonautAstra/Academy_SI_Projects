package Esercizio_4;

public class CoffeVanilla extends CoffeDecorator{

	public CoffeVanilla(Coffe coffe) {
		super(coffe);
	}

	public void whatCoffe() {
		coffe.whatCoffe();
		this.plus();
	}
	
	public void plus() {
		System.out.print(" + vanilla");
	}
	
}
