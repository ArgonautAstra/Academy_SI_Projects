package Esercizio_1;

public class PdfDocument  extends Document {

	public PdfDocument(String title) {
		super(title);
	}

	public String print() {
		return "Sono il documento PDF " + title;
	}

	public void save() {
		System.out.println("Il documento PDF è stato salvato");
	}

	public void load() {
		System.out.println("Il documento " + title + ".pdf è stato aperto");
	}

}
