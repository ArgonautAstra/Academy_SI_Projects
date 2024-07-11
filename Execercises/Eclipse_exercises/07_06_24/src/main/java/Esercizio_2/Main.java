package Esercizio_2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Transport[] transports = new Transport[3];
		Random random = new Random();

		transports[0] = new Bus(34);
		transports[1] = new Train(110);
		transports[2] = new Airplane(350);
		
		for(int i = 0; i < 3; i++) {
			transports[i].start();
			transports[i].stop();
			transports[i].calculateCost(random.nextInt(50,2000));
			System.out.println("");
		}

	}

}
