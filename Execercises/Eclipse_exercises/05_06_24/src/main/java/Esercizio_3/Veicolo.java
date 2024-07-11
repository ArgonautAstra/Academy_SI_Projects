package Esercizio_3;

import java.util.regex.*;

public class Veicolo {
	
	protected String targa, marca, modello;
	protected boolean guasto;
	
	public Veicolo() {}	
	
	public Veicolo(String targa, String marca, String modello, boolean guasto) {

		this.marca = marca;
		this.modello = modello;
		this.guasto = guasto;
		
		if(targa.length() == 7 && Pattern.matches("[A-Z][A-Z][0-9][0-9][0-9][A-Z][A-Z]",targa)) {
			this.targa = targa;
		}else
			System.out.println("Inserire targa corretta");
	}

	public String getTarga() {
		return targa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public boolean isGuasto() {
		return guasto;
	}

	public void setTarga(String targa) {
		
		if(targa.length() == 7 && Pattern.matches("[A-Z][A-Z][0-9][0-9][0-9][A-Z][A-Z]",targa)) {
			this.targa = targa;
		}else
			System.out.println("Inserire targa corretta");
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setGuasto(boolean guasto) {
		this.guasto = guasto;
	}
	
	public void usaVeicolo() {
		setGuasto(true);
	}

	@Override
	public String toString() {
		return "Veicolo targato: " + targa + " e' una " + marca + " " + modello + ", ed è " + (guasto ? "guasto" : "funzionante");
	}	

}
