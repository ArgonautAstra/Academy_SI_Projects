package Esercizio_8;

import java.util.ArrayList;

public class OrderService implements Controller {
	
	private int orderID, userID;
	private ArrayList<ProductService> products = new ArrayList<ProductService>();
	
	public OrderService() {}
	
	public OrderService(int orderID, int userID) {
		this.orderID = orderID;
		this.userID = userID;
	}

	public int getOrderID() {
		return orderID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public ArrayList<ProductService> getProducts() {
		return products;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void search(Object obj) {
		
		try {
			
			Integer src = ((Integer) obj);
			
			// Effettua l'accesso al database
			// 
			// Cerca il prodotto
			// 
			// Se la ricerca ha successo restituisce 
			// la lista del/i prodotto/i cercato/i
			// (si suppone una pagina web con i prodotti
			// con relativi bottoni).
			// 
			// Se la ricerca NON ha successo non 
			// restituisce alcuna lista di prodotti
			// (si suppone una pagina web senza prodotti).
			
			System.out.println("Return of a Web page");
			
		}catch(ClassCastException e) {
			System.out.println("Java Object type not correct");
		}
	}

	public boolean addProduct(ProductService product) {
		return products.add(product);
	}

	public boolean removeProduct(ProductService product) {
		return products.remove(product);
	}

	public void viewInfo() {
		System.out.println("OrderID: " + orderID + " of UserID: " + userID + "\nOrder list:");
		for(ProductService item : products)
			item.viewInfo();
	}
}
