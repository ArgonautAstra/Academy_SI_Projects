package Esercizio_4;

public class Main {

	public static void main(String[] args) {

		Coffe coffeDecorator1 = new CoffeVanilla(new CoffeStandard());
		Coffe coffeDecorator2 = new CoffeMilk(new CoffeStandard());
		Coffe coffeDecorator3 = new CoffeChoco(new CoffeStandard());

		coffeDecorator1.whatCoffe();
		System.out.println();
		coffeDecorator2.whatCoffe();
		System.out.println();
		coffeDecorator3.whatCoffe();
	}

}
