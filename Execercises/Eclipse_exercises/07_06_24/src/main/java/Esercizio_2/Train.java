package Esercizio_2;

public class Train extends Transport {

	public Train(double speed) {
		super(speed);
	}

	public void start() {
		System.out.println("Treno partito");
	}

	public void stop() {
		System.out.println("Treno fermato");
	}

	public float calculateCost(double distance) {
		
		try {
			distance = Math.abs(distance);
			System.out.println("La distanza da percorrere è: " + distance + " Km.");
			System.out.println("Il viaggio con il treno dura circa: " + (int) (distance/speed * 60) + " min.");
			System.out.println("Il prezzo per lo spostamento con il treno è di: " + String.format("%.2f", distance* 2.83) + " €.");
			return (float) (distance * 2.83);
		}catch(NullPointerException e){
			System.out.println("Inserire un valore distanza valido.");
			return 0;
		}
	}

}
