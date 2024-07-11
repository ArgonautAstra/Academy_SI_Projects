package Esercizio_3;

public class Main {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		
		inventory.addProduct("Peach", 20, 0.35f);
		
		inventory.updateQuantityProduct("Apple", 100);
		
		inventory.removeProduct("Pear");
	}

}


