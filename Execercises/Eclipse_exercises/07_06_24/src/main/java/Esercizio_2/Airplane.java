package Esercizio_2;

public class Airplane extends Transport {

	public Airplane(double speed) {
		super(speed);
	}

	public void start() {
		System.out.println("Aeroplano partito");
	}

	
	public void stop() {
		System.out.println("Aeroplano atterrato");
	}

	
	public float calculateCost(double distance) {
		
		try {
			distance = Math.abs(distance);
			if(distance > 500) {
				System.out.println("La distanza da percorrere è: " + distance + " Km.");
				System.out.println("Il viaggio con in aereo dura circa: " + (int) (distance/speed * 60) + " min.");
				System.out.println("Il prezzo per lo spostamento con l'aereo è di: " + String.format("%.2f", distance* 0.05) + " €.");
				return (float) (distance * 0.05);
			}else{
				System.out.println("Và pigghiati u treno!");
				return 0;
			}
		}catch(NullPointerException e){
			System.out.println("Inserire un valore distanza valido.");
			return 0;
		}
	}
}
