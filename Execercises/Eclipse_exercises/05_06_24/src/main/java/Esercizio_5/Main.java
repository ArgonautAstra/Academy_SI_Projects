package Esercizio_5;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ContoCorrente> conti = new ArrayList<ContoCorrente>();
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			conti.add(new ContoCorrenteSemplice(random.nextInt(20), random.nextDouble(10000), 3.3));
			conti.add(new ContoCorrenteComposto(random.nextInt(20), random.nextDouble(10000), 3.3));
		}
		
		for(ContoCorrente item : conti) {
			System.out.println("Capitale iniziale: " + item.getCapitaleIniziale() + " €,");
			System.out.println("Periodo attività: " + item.getPeriodoAttività() + " anni,");
			System.out.println("Somma Conto Corrente " + 
								(item instanceof ContoCorrenteComposto ? "Composto: " : "Semplice: ") + 
								item.sommaCorrente() + " €.\n");
		}
	}

}
