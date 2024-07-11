package Esercizio_5.Computer;

import Esercizio_5.Computer.ComputerClasses.*;

public class ComputerFacade {
	
	private ComputerOnOff computerOnOff;
	private ComputerApplication1 computerApplication1;
	private ComputerApplication2 computerApplication2;
	
	public ComputerFacade() {
		this.computerOnOff = new ComputerOnOff();
		this.computerApplication1 = new ComputerApplication1();
		this.computerApplication2 = new ComputerApplication2();
	}
	
	public void startComputer() {
		computerOnOff.boot();
	}
	
	public void shutdownComputer() {
		computerOnOff.shutdown();
	}
	
	public void startAppliction1() {
		computerApplication1.start();
	}
	
	public void startApplication2() {
		computerApplication2.start();
	}
	
	public void startAndShutdown() {
		computerOnOff.boot();
		computerOnOff.shutdown();
	}
	
	
	
}
