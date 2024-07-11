package Esercizio_1;

public class SpreadsheetDocument extends Document {

	public SpreadsheetDocument(String title) {
		super(title);
	}

	public String print() {
		return "Sono il documento Spreadsheet " + title;
	}

	public void save() {
		System.out.println("Il documento Spreadsheet è stato salvato");
	}

	public void load() {
		System.out.println("Il documento " + title + ".sps è stato aperto");
	}

}
