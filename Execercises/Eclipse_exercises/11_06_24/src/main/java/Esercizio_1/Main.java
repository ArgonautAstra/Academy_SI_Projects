package Esercizio_1;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		File dir = new File("src/main/java/Esercizio_1/log");
		dir.mkdir();
		
		File text = new File(dir,"destination.txt");
		try {
			text.createNewFile();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		BufferedReader input = new BufferedReader(new FileReader("src/main/java/Esercizio_1/log/source.txt"));
		BufferedWriter output = new BufferedWriter(new FileWriter(text));
		
		output.write(input.readLine());

		input.close();
		output.close();
		
	}

}


