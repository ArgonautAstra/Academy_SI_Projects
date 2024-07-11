package Esercizio_6;

import java.util.Random;

public class Main{

	public static void main(String[] args) {

		Buffer buffer = new Buffer();
		Random random = new Random();

		Runnable task1 = () -> {
			System.out.println("Thread 1 avviato...");
			
			try {
				for (int i = 0; i < 10; i++) {
					buffer.increment(random.nextInt(10));
					System.out.println(buffer.getCount().toString());
					Thread.sleep(500);
				}
				
			}catch (InterruptedException e){
				System.out.println(e.getMessage());
			}
		};
		
		Runnable task2 = () -> {
			System.out.println("Thread 2 avviato...");
			
			try {
				for (int i = 0; i < 10; i++) {
					buffer.decrement();
					System.out.println(buffer.getCount().toString());
					Thread.sleep(1000);
				}
				
			}catch (InterruptedException e){
				System.out.println(e.getMessage());
			}
		};

		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		try{		
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}


