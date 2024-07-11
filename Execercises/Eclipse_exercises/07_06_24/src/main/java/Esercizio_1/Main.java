package Esercizio_1;

public class Main {

	public static void main(String[] args) {

		Document[] documents = new Document[3];

		try {
			documents[0] = new WordDocument("Word_di_Pippo");
			documents[1] = new PdfDocument("PDF_di_Pluto");
			documents[2] = new SpreadsheetDocument("Spreadsheet_di_Paperino");
			documents[3] = new SpreadsheetDocument("Spreadsheet_di_Paperino_extra");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Aggiunti troppi file nell'archivio\n");
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(documents[i].print());
			documents[i].save();
			documents[i].load();
			System.out.println("");
		}

	}

}
