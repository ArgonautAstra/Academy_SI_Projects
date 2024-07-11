package Esercizio_6;

import java.util.ArrayList;

public class Suite implements HotelBooking {

	private final int MAX_ROOMS = 5;
	private ArrayList<String> guests = new ArrayList<String>();
	
	public Suite() {}

	public void bookRoom(String passengerName) {
		
		if(guests.size() < MAX_ROOMS) {
			guests.add(passengerName);
			System.out.println("Ospite " + passengerName + " ha PRENOTATO una Suite");
		}else{
			System.out.println("Posti nelle Suite terminati");
		}
	}

	public void cancelRoom(String passengerName) {
		
		if(guests.remove(passengerName)) {
			System.out.println("Ospite " + passengerName + " ha LIBERATO una Suite");
		}else{
			System.out.println("Non esiste alcuna prenotazione di una Suite a nome di " + passengerName);
		}
	}
	
	public void avaibleRoom() {
		System.out.println("Suite disponibili: " + (MAX_ROOMS - guests.size()));
	}
}
