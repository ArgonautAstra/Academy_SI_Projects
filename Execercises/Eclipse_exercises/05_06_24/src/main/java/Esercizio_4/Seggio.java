package Esercizio_4;

import java.util.ArrayList;

public class Seggio {

	private ArrayList<Cittadino> seggio = new ArrayList<Cittadino>();

	public void aggiungiVoto(Cittadino cittadino) {
		seggio.add(cittadino);
	}

	public ArrayList<Cittadino> getSeggio() {
		return seggio;
	}

	public int[] getVotiCamera() {
		
		int[] voti = new int[4];
		
		for(Cittadino item : seggio) {
			switch(item.getVoto()) {
			case SINISTRA:
				voti[0]++;
				break;
			case DESTRA:
				voti[1]++;
				break;
			case CENTRO:
				voti[2]++;
				break;
			case NULLO:
				voti[3]++;
				break;
			}
		}
		
		System.out.println("Voti della Camera" + 
		"\nSinistra: " + voti[0] + 
		"\nDestra: " + voti[1] + 
		"\nCentro: " + voti[2] + 
		"\nNullo: " + voti[3]);
		
		return voti;
	}

	public int[] getVotiSenato() {
		
		int[] voti = new int[4];
		
		for(Cittadino item : seggio) {
			if(item instanceof CittadinoSenato) {
				switch(item.getVoto()) {
				case SINISTRA:
					voti[0]++;
					break;
				case DESTRA:
					voti[1]++;
					break;
				case CENTRO:
					voti[2]++;
					break;
				case NULLO:
					voti[3]++;
					break;
				}
			}
		}
		
		System.out.println("Voti del Senato" + 
		"\nSinistra: " + voti[0] + 
		"\nDestra: " + voti[1] + 
		"\nCentro: " + voti[2] + 
		"\nNullo: " + voti[3]);
		
		return voti;
	}
}
