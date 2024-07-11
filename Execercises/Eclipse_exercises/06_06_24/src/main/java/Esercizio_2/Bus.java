package Esercizio_2;

public class Bus extends Transport {

	public Bus(double speed) {
		super(speed);
	}

	public void start() {
		System.out.println("Bus partito");
	}

	public void stop() {
		System.out.println("Bus fermato");
	}

	public float calculateCost(double distance) {
		System.out.println("La distanza da percorrere è: " + distance + " Km.");
		System.out.println("Il viaggio con il bus dura circa: " + (int) (distance/speed * 60) + " min.");
		System.out.println("Il prezzo per lo spostamento con il bus è di: " + String.format("%.2f", distance* 1.74) + " €.");
		return (float) (distance * 1.74);
	}

}
