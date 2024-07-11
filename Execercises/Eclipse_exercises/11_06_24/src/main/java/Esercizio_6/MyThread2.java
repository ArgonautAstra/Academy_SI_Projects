package Esercizio_6;

public class MyThread2 extends Thread {
	
	public void run(){
		System.out.println("Il thread 2 in esecuzione...");
		
		for(int i = 1; i <= 3; i++) {
			try {
				System.out.println(i);
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
