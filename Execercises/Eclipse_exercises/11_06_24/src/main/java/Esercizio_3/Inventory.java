package Esercizio_3;

import java.io.*;

public class Inventory {

	private File oldFile, newFile;
	
	public Inventory(){
		oldFile = new File("src/main/java/Esercizio_3/log","inventory.txt");
		newFile = new File("src/main/java/Esercizio_3/log/inventory_updated.txt");

		try {
			BufferedReader input = new BufferedReader(new FileReader(oldFile));
			BufferedWriter output = new BufferedWriter(new FileWriter(newFile));
			
			String line;
			
			while((line = input.readLine()) != null) {
				output.write(line + "\n");
			}
			
			input.close();
			output.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void addProduct(String product, int quantity, float price) {
		
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(newFile, true));
			
			output.append(product + "," + quantity + "," + price);
	
			output.close();
		}catch(IOException e){
			System.out.println();
		}
	}
	
	public void updateQuantityProduct(String product, int quantity) {
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(newFile));
			
			String file = "";
			String line = "";

			while((line = input.readLine()) != null) {
				if(line.contains(product))
					file += product + "," + quantity + "," + line.split(",")[2] + "\n";
				else
					file += line + "\n";
			}			
	
			input.close();
			
			BufferedWriter output = new BufferedWriter(new FileWriter(newFile));
			
			output.write(file);

			output.close();
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	public void removeProduct(String product) {
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(newFile));
			
			String file = "";
			String line = "";

			while((line = input.readLine()) != null) {
				if(line.contains(product))
					continue;
				else
					file += line + "\n";
			}			
	
			input.close();
			
			BufferedWriter output = new BufferedWriter(new FileWriter(newFile));
			
			output.write(file);

			output.close();
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
