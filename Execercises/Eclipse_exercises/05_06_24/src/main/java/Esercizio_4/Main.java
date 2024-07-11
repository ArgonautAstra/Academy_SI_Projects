package Esercizio_4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Seggio seggio = new Seggio();
		Random random = new Random();
		int age;
		
		for(int i = 0; i < 100; i++) {
			
			age = random.nextInt(60);
			
			if(age < 21) {
				seggio.aggiungiVoto(new Cittadino(age));
			}
			else {
				seggio.aggiungiVoto(new CittadinoSenato(age));
			}
		}
		
		for(Cittadino item : seggio.getSeggio()) {
			
			if(item instanceof CittadinoSenato) {
				
				CittadinoSenato tmp = (CittadinoSenato) item;
				
				switch(random.nextInt(4)) {
				case 0:
					tmp.setVotoCamera(Preferenza.SINISTRA);
					break;
				case 1:
					tmp.setVotoCamera(Preferenza.DESTRA);
					break;
				case 2:
					tmp.setVotoCamera(Preferenza.CENTRO);
					break;
				case 3:
					tmp.setVotoCamera(Preferenza.NULLO);
					break;
				}

				switch(random.nextInt(4)) {
				case 0:
					tmp.setVotoSenato(Preferenza.SINISTRA);
					break;
				case 1:
					tmp.setVotoSenato(Preferenza.DESTRA);
					break;
				case 2:
					tmp.setVotoSenato(Preferenza.CENTRO);
					break;
				case 3:
					tmp.setVotoSenato(Preferenza.NULLO);
					break;
				}
				
			}else{
				
				switch(random.nextInt(4)) {
				case 0:
					item.setVoto(Preferenza.SINISTRA);
					break;
				case 1:
					item.setVoto(Preferenza.DESTRA);
					break;
				case 2:
					item.setVoto(Preferenza.CENTRO);
					break;
				case 3:
					item.setVoto(Preferenza.NULLO);
					break;
				
				}
			}
		}

		seggio.getVotiCamera();
		System.out.println("");
		seggio.getVotiSenato();

	}

}
