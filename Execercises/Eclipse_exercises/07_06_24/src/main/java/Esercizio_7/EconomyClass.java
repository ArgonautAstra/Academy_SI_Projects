package Esercizio_7;

import java.util.ArrayList;

public class EconomyClass implements FlightBooking {

	private final int MAX_SEATS = 10;
	private ArrayList<String> passengers = new ArrayList<String>();
	
	public EconomyClass() {}

	public void bookTicket(String passengerName) {
		
		if(passengers.size() < MAX_SEATS) {
			passengers.add(passengerName);
			System.out.println("Passeggero " + passengerName + " ha PRENOTATO un posto in Classe Economy");
		}else{
			System.out.println("Posti in Classe Economy terminati");
		}
	}

	public void cancelTicket(String passengerName) {
		
		if(passengers.remove(passengerName)) {
			System.out.println("Passeggero " + passengerName + " ha LIBERATO un posto in Classe Economy");
		}else{
			System.out.println("Non esiste alcuna prenotazione a nome di " + passengerName + "in Classe Economy");
		}
		
	}
	
	public void avaibleSeats() {
		System.out.println("Posti in Classe Economy disponibili: " + (MAX_SEATS - passengers.size()));
	}

}
