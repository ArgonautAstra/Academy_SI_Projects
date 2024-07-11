package Esercizio_1;

public class WordDocument extends Document  {

	public WordDocument(String title) {
		super(title);
	}

	public String print() {
		return "Sono il documento Word: " + title;
	}

	public void save() {
		System.out.println("Il documento Word è stato salvato");
	}

	public void load() {
		System.out.println("Il documento " + title + ".docx è stato aperto");
	}

}
