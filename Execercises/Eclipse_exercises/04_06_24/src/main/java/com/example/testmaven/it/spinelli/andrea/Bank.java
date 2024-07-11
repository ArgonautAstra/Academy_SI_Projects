package com.example.testmaven.it.spinelli.andrea;

import java.util.HashMap;

public class Bank {
	
	private String name;
	private HashMap<String,Conto> contiBancari = new HashMap<String,Conto>();

	public Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addConto(String name, String surname, String IBAN, String bankName) {
		contiBancari.put(IBAN, new Conto(name,surname,IBAN,bankName,0f));
	}
	
	public Conto getConto(String IBAN) {
		return contiBancari.get(IBAN);
	}
	
	
}
