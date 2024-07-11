package Esercizio_7;

import java.util.concurrent.locks.ReentrantLock;

public class Reader implements Runnable{
	
	ReentrantLock lock;
	Data data;
	int value;

	public Reader(ReentrantLock lock, Data data){
		this.lock = lock;
		this.data = data;
	}
	
	public void run(){
		try {
			data.getValue(lock);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
