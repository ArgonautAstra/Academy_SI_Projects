package Esercizio_6;

import java.util.Scanner;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		StandardRoom room = new StandardRoom();
		Suite suite = new Suite();
		
		for(Integer i = 1000; i < 1010; i++) {
			room.bookRoom(i.toString());
			room.avaibleRoom();
		}

		
		room.viewBook();
		System.out.println("");

		for(Integer i = 0; i < 5; i++) {
			try {
				System.out.print("Nome e cognome: ");
				String name = input.nextLine();
				
				if(!Pattern.matches("[a-zA-Z]+", name))
					throw new Exception("Nome inserito errato");
				
				suite.bookRoom(name);
				suite.avaibleRoom();
				
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		suite.viewBook();
		
		suite.changeName(input.nextLine(), input.nextLine());
		
		suite.viewBook();
		
		
		input.close();
	}

}
