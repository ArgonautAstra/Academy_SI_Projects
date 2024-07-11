package Esercizio_7;

import java.util.concurrent.locks.ReentrantLock;

public class Writer implements Runnable{
	
	ReentrantLock lock;
	Data data;
	int value;

	public Writer(ReentrantLock lock, Data data, int value){
		this.lock = lock;
		this.data = data;
		this.value = value;
	}
	
	public void run(){
		try {
			data.setValue(value, lock);;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
