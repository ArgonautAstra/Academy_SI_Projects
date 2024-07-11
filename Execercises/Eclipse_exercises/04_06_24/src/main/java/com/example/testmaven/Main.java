package com.example.testmaven;

import com.example.testmaven.it.spinelli.andrea.*;

public class Main {

	public static void main(String[] args) {
		
		//Esercizio 1
		String string = new String("    Oggi c'e' il sole    ");

		System.out.println(string.trim());
		

		System.out.println("\n");

		//Esercizio 2
		Concatena concatena1 = new Concatena("Mario","Rossi",true);
		Concatena concatena2 = new Concatena("Mario","Rossi",false);
		
		System.out.println(concatena1.concat());
		System.out.println(concatena2.concat());
		

		System.out.println("\n");

		//Esercizio 3
		Concatena concatena3 = new Concatena();
		Concatena concatena4 = new Concatena();
		
		System.out.println(concatena3.sottoStringa("Luca"));
		System.out.println(concatena4.sottoStringa("Po"));
		

		System.out.println("\n");

		//Esercizio 4
		Inserisci inserisci = new Inserisci();
		System.out.println(inserisci.insertChar("Alloro",'-'));
		System.out.println(inserisci.insertCharRecursive("Alloro",'-',true));
		

		System.out.println("\n");

		//Esercizio 5
		Ricerca ricerca1 = new Ricerca();
		int[] array1 = {0,7,3,1,9,5};
		System.out.println(ricerca1.findMin(array1,array1[0]));
		

		System.out.println("\n");

		//Esercizio 6
		Ricerca ricerca2 = new Ricerca();
		int[] array2 = {4,7,3,1,9,5};
		System.out.println(ricerca2.recursiveSum(array2,0));
		

		System.out.println("\n");

		//Esercizio 7
		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.iterativeFibonacci(4));
		System.out.println(fibonacci.recursivableFibonacci(4));
		

		System.out.println("\n");

		//Esercizio 8
		Studente studente1 = new Studente("Andrea","Spinelli",12345);
		Studente studente2 = new Studente();
		
		studente2.setNome("Valerio");
		studente2.setCognome("Conigliaro");
		studente2.setMatricola(54321);
		
		System.out.println(studente1.toString());
		System.out.println(studente2.toString());

		System.out.println("\n");

		//Esercizio 9
		Bank bank = new Bank("EuroBank");
		bank.addConto("Andrea", "Spinelli", "AS1234567890", "MedioLonum");
		bank.addConto("Valerio", "Conigliaro", "VC1234567890", "Lonad");
		System.out.println(bank.getConto("AS1234567890").deposit(1000));
		System.out.println(bank.getConto("AS1234567890").withdraw(500));
		System.out.println(bank.getConto("AS1234567890").withdraw(400));

		System.out.println("\n");

		//Esercizio 10
		Libro libro1 = new Libro("La ricerca di Pippo", "D2G", "Non Pippo", "1372");
		Libro libro2 = new Libro();
		
		libro2.setTitolo("Pippo è stato ritrovato");
		libro2.setISBN("G2D");
		libro2.setAutore("Mario Rossi");
		libro2.setAnno("2024");
		
		System.out.println(libro1.stampaInfo());
		System.out.println(libro2.stampaInfo());
	}

}
