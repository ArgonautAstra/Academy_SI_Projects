package Esercizio_5;

public class MyThread1 extends Thread {
	
	public void run(){
		System.out.println("Il thread 1 in esecuzione...");
		
		for(int i = 1; i <= 5; i++) {
			try {
				System.out.println(i);
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
