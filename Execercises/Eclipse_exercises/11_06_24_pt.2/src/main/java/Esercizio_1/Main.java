package Esercizio_1;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		UserSingleton userSingleton, userSingleton2;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			FileInputStream file = new FileInputStream("src/main/java/Esercizio_1/user.txt");
			ObjectInputStream input = new ObjectInputStream(file);
			
			userSingleton = (UserSingleton) input.readObject();
			
			System.out.println(userSingleton.getIstance());
			
			userSingleton2 = userSingleton;
			
			System.out.println(userSingleton2.getIstance());
		} catch (FileNotFoundException e) {

			try {
				FileOutputStream file2 = new FileOutputStream("src/main/java/Esercizio_1/user.txt");
				ObjectOutputStream output = new ObjectOutputStream(file2);
				
				userSingleton = new UserSingleton();
				
				System.out.print("Nome: ");
				userSingleton.setFirstname(scanner.nextLine());
				System.out.print("Cognome: ");
				userSingleton.setLastname(scanner.nextLine());
				
				output.writeObject(userSingleton);
			}catch (IOException e2) {
				e2.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
