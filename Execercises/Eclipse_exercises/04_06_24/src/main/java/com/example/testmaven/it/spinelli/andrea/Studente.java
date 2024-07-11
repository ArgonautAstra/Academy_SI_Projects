package com.example.testmaven.it.spinelli.andrea;

public class Studente {
	
	private String nome, cognome;
	private int matricola;
	
	public Studente() {}
	
	public Studente(String nome, String cognome, int matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
}


