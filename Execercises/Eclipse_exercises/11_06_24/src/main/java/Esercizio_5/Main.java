package Esercizio_5;

public class Main {

	public static void main(String[] args) {

		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();

		thread2.start();
		
		try{
			thread2.join();
			thread1.start();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}


