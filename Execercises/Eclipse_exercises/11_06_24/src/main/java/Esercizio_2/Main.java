package Esercizio_2;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File text = new File("src/main/java/Esercizio_2/log","error.log");
		try {
			text.createNewFile();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		BufferedReader input = new BufferedReader(new FileReader("src/main/java/Esercizio_2/log/system.log"));
		BufferedWriter output = new BufferedWriter(new FileWriter(text));
		
		String line;
		
		while(input.read() != -1) {
			line = input.readLine();
			
			if(line.contains("ERROR")) {
				output.write(line+"\n");
			}
		}

		input.close();
		output.close();
	}

}


