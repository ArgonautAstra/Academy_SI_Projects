package Esercizio_1;

import java.io.Serializable;

public class Prova implements Serializable{
	
	int a,b;
	
	public Prova(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void somma() {
		System.out.println(a+b);
	}
}
