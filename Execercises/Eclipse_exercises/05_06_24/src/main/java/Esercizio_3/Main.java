package Esercizio_3;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();

		veicoli.add(new Vettura("AA123BB","Fiat","Panda",false,"Utilitaria"));
		veicoli.add(new Motociclo("BB123CC","Honda","CBR",false,125));
		veicoli.add(new Vettura("CC123DD","Lamborghini","Hurricane",false,"Sportiva"));
		veicoli.add(new Motociclo("DD123EE","Suzuki","GSX",false,600));
		veicoli.add(new Vettura("EE123FF","Audi","A5",false,"Utilitaria"));
		veicoli.add(new Motociclo("FF123GG","Yamaha","R1",false,1000));
		
		System.out.println("Lista veicoli:");
		for(Veicolo item : veicoli) {
			System.out.println(item.toString());
		}

		for(Veicolo item : veicoli) {
			if(Math.random() > 0.5)
				item.usaVeicolo();
		}

		System.out.println("\nLista veicoli che si sono guastati in tempi record:");
		for(Veicolo item : veicoli) {
			if(item.isGuasto()) {
				System.out.println(item.toString());
			}
		}
		
		Officina officina = new Officina();
		
		System.out.println("\nRiparazioni:");
		for(Veicolo item : veicoli) {
			if(item.isGuasto()) {
				System.out.println("Il prezzo per la ripazione e': " + officina.ripara(item) + "€");
			}
		}
	}

}
