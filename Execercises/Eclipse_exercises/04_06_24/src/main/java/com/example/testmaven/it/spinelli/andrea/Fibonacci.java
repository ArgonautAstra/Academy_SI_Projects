package com.example.testmaven.it.spinelli.andrea;

public class Fibonacci {

	private int fib1 = 0, fib2 = 0;
	
	public Fibonacci() {}
	
	private void reset() {
		fib1 = 0;
		fib2 = 0;
	}
	
	public int iterativeFibonacci(int value) {
		
		if(value > 0) {
			if(value > 1) {
				int res = 1;
				for(int i = 1; i < value; i++) {
					res += fib1;
					fib1 = res - fib1;
				}
				
				reset();
				
				return res;
			}else
				return 1;
		}
		
		return -1;
	}
	
	public int recursiveFibonacci(int value) {
		
		int res = recursivableFibonacci(value);
		
		reset();
				
		return res;
	}
	
	public int recursivableFibonacci(int value) {
		
		if(value > 0) {
			if(value > 1) {
				
				fib1 += recursivableFibonacci(value - 1) + fib2;
				
				fib2 = fib1 - fib2;
				
				return fib1;				
			}else
				return 1;
		}
		
		return -1;
	}
	
	
	
	
}
