package Esercizio_6;

import java.util.ArrayList;

public class Buffer extends Thread{
	
	private ArrayList<Integer> product;
	private final int MAX_VALUE = 5;
	
	public Buffer() {
		product = new ArrayList<>();
	}
	
	public synchronized void increment(int value) throws InterruptedException {
		
		while(product.size() >= MAX_VALUE)
			wait();
		
		product.add(value);
		
		notifyAll();
	}
	
	public synchronized void decrement() throws InterruptedException {
		
		while(product.size() <= 0) 
			wait();
		
		product.remove(product.size()-1);
		
		notifyAll();
		
	}

	public ArrayList<Integer> getCount() {
		return product;
	}	
}
