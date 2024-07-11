package Esercizio_5;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args){
		
		ArrayList<ContoCorrente> conti = new ArrayList<ContoCorrente>();
		
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			try{
				conti.add(new ContoCorrenteSemplice(random.nextInt(-20,20), random.nextDouble(10000), 3.3));
			
			}catch(ContoCorrenteConstructorException e){
				System.out.println(e.getMessage());
			}
		}
		
		for(int i = 0; i < 5; i++) {
			try{
				conti.add(new ContoCorrenteComposto(random.nextInt(-20,20), random.nextDouble(10000), 3.3));
			
			}catch(ContoCorrenteConstructorException e){
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("");
		
		for(int i = 0; i < conti.size(); i++) {
			System.out.println("Capitale iniziale: " + conti.get(i).getCapitaleIniziale() + " €,");
			System.out.println("Periodo attività: " + conti.get(i).getPeriodoAttivita() + " anni,");
			System.out.println("Somma Conto Corrente " + 
								(conti.get(i) instanceof ContoCorrenteComposto ? "Composto: " : "Semplice: ") + 
								conti.get(i).sommaCorrente() + " €.\n");
								
		}
	}

}
