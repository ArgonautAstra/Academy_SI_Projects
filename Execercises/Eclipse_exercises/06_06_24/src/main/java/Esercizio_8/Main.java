package Esercizio_8;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		ProductService product1 = new ProductService(1,"Computer bleh","Elettronica");
		ProductService product2 = new ProductService(2,"Computer ok","Elettronica");
		ProductService product3 = new ProductService(3,"Computer fiko","Elettronica");
		
		System.out.println("CREAZIONE UTENTE:");
		
		UserService user = new UserService(12345,"Mario","Rossi");
		
		user.viewInfo();

		System.out.println("\nCREAZIONE ORDINE E AGGIUNTA DI PRODOTTI NELL'ORDINE:");
		
		user.addOrder(product1);		
		user.addProductToOrder(user.getOrders().get(0).getOrderID(), product2);
		user.addProductToOrder(user.getOrders().get(0).getOrderID(), product3);
		
		System.out.println("\nVISUALIZZAZIONE ORDINE");
		
		user.getOrders().get(0).viewInfo();

		System.out.println("\nRIMOZIONE PRODOTTO DALL'ORDINE");
		
		user.removeProductToOrder(user.getOrders().get(0).getOrderID(),product2);

		System.out.println("\nVISUALIZZAZIONE ORDINE DOPO LA RIMOZIONE");
		
		user.getOrders().get(0).viewInfo();

		System.out.println("\nRICERCA PRODOTTO");

		user.search("Computer fiko");
		user.search(product1);
	}

}
