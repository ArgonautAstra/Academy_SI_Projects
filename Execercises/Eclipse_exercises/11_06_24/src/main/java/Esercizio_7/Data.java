package Esercizio_7;

import java.util.concurrent.locks.ReentrantLock;

public class Data extends Thread{
	
	private int value = 0;

	public int getValue(ReentrantLock lock) throws InterruptedException {
		lock.lock();
		System.out.println("Lettura del dato");
		Thread.sleep(2000);
		lock.unlock();
		return value;
	}

	public void setValue(int value, ReentrantLock lock) throws InterruptedException {
		lock.lock();
		System.out.println("Scrittura del dato");
		Thread.sleep(4000);
		this.value = value;
		lock.unlock();
	}
}
