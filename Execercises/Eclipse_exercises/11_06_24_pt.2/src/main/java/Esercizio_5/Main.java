package Esercizio_5;

import Esercizio_5.Computer.ComputerFacade;

public class Main {

	public static void main(String[] args) {

		ComputerFacade computer = new ComputerFacade();

		computer.startComputer();
		computer.startAppliction1();
		computer.startApplication2();
		computer.shutdownComputer();
		
		computer.startAndShutdown();
	
	}

}
