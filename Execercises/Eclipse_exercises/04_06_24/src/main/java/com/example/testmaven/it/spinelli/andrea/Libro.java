package com.example.testmaven.it.spinelli.andrea;

public class Libro {

	private String titolo, ISBN, autore, anno;
	
	public Libro() {}

	public Libro(String titolo, String ISBN, String autore, String anno) {

		if(ISBN.length() == 13)
			this.ISBN = ISBN;
		else
			System.out.println("ISBN non valido");
			
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getAutore() {
		return autore;
	}

	public String getAnno() {
		return anno;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setISBN(String ISBN) {
		if(ISBN.length() == 13)
			this.ISBN = ISBN;
		else
			System.out.println("ISBN non valido");
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String stampaInfo() {
		return "Libro [titolo=" + titolo + ", ISBN=" + ISBN + ", autore=" + autore + ", anno=" + anno + "]";
	}	
}
