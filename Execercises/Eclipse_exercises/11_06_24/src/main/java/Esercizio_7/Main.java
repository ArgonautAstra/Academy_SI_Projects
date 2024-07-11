package Esercizio_7;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
	public static void main(String[] args) {
		
		//ReadWriteLock lock = new ReadWriteLock();
		ReentrantLock lock = new ReentrantLock();
		Data data = new Data();

		Thread writer = new Thread(new Writer(lock, data, 10));
		Thread reader1 = new Thread(new Reader(lock, data));
		Thread reader2 = new Thread(new Reader(lock, data));
		
		writer.start();
		reader1.start();
		reader2.start();
		
		try {
			reader1.setPriority(1);
			reader2.setPriority(1);
			writer.setPriority(4);
	
			reader1.join();
			reader2.join();
			writer.join();
		
		}catch(InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
 }


