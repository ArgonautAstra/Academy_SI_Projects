package Esercizio_4;

public class CoffeMilk extends CoffeDecorator{

	public CoffeMilk(Coffe coffe) {
		super(coffe);
	}

	public void whatCoffe() {
		coffe.whatCoffe();
		this.plus();
	}
	
	public void plus() {
		System.out.print(" + milk");
	}
	
}
