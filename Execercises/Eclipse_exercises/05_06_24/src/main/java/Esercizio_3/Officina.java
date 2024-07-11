package Esercizio_3;

public class Officina {

	public int ripara(Veicolo veicolo) {
		
		if(veicolo.isGuasto()) {
			
			if(veicolo instanceof Motociclo) {
				
				veicolo.setGuasto(false);
				
				Motociclo motociclo = (Motociclo) veicolo;

				return motociclo.getCilindrata() * 10;
				
			}else if(veicolo instanceof Vettura){
				
				veicolo.setGuasto(false);
				
				Vettura vettura = (Vettura) veicolo;
				
				switch(vettura.getTipologia()) {
				case "Utilitaria": 
					return 500;
				case "Sportiva":
					return 1000;
				default:
					return 100;
				}
			}else{
				return 0;
			}
			
		}else{
			System.out.println("Il veicolo non è rotto");
			return 0;
		}
	}
	
}
