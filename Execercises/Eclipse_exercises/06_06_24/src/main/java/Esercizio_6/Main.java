package Esercizio_6;

public class Main {

	public static void main(String[] args) {
		
		StandardRoom room = new StandardRoom();
		Suite suite = new Suite();
		
		for(Integer i = 1000; i < 1010; i++) {
			room.bookRoom(i.toString());
		}
		room.avaibleRoom();
		
		System.out.println("");

		for(Integer i = 2000; i < 2005; i++) {
			suite.bookRoom(i.toString());
		}
		suite.avaibleRoom();
	}

}
