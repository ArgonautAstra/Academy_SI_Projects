package Esercizio_1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Forma> forme = new ArrayList<Forma>();

		forme.add(new Triangolo(4));
		forme.add(new Quadrato(10));
		forme.add(new Rettangolo(10,5));
		forme.add(new Cerchio(2.5f));

		System.out.println("Perimetro");
		for(Forma item : forme) 
			System.out.println(item.calcPerimeter());
		
		System.out.println("Area");
		for(Forma item : forme) 
			System.out.println(item.calcArea());
		
	}

}
