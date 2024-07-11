package Esercizio_7;

public class Main {

	public static void main(String[] args) {
		
		EconomyClass economy = new EconomyClass();
		BusinessClass business = new BusinessClass();
		
		for(Integer i = 1000; i < 1010; i++) {
			economy.bookTicket(i.toString());
		}
		economy.avaibleSeats();
		
		System.out.println("");

		for(Integer i = 2000; i < 2005; i++) {
			business.bookTicket(i.toString());
		}
		business.avaibleSeats();
	}

}
