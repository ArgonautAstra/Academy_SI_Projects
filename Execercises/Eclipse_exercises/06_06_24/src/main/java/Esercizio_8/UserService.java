package Esercizio_8;

import java.util.ArrayList;
import java.util.Random;

public class UserService implements Controller {
	
	private int userID;
	private String firstname, lastname;
	private ArrayList<OrderService> orders = new ArrayList<OrderService>();
	
	public UserService() {}
	
	public UserService(int userID, String firstname, String lastname) {
		this.userID = userID;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public int getUserID() {
		return userID;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	public ArrayList<OrderService> getOrders() {
		return orders;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void search(Object obj) {
		
		try {
			
			String src = ((String) obj);
			
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
	
	public void addOrder(ProductService product) {
		
		Random random = new Random();
		
		int tmpOrderID = random.nextInt(0, 1000);
		
		OrderService newOrder = new OrderService(tmpOrderID, userID);
		
		newOrder.getProducts().add(product);
		
		orders.add(newOrder);
		
		System.out.println("Order " + tmpOrderID + " added");
	}
	
	public void removeOrder(int orderID) {
		
		OrderService products = orders.get(orderID);
		
		for(ProductService product : products.getProducts())
			products.removeProduct(product);			
		
		orders.remove(orderID);
		
		System.out.println("Order removed");
	}

	public void addProductToOrder(int orderID, ProductService product) {
		
		int indexOrderID = 0;
		
		for(OrderService item : orders)
			if(item.getOrderID() != orderID)
				indexOrderID++;
		
		if(orders.get(indexOrderID).addProduct(product))		
			System.out.println("Product " + product.getProductID() +" added to the order " + orderID);
		else
			System.out.println("Product " + product.getProductID() +" not added to the order " + orderID);
	}
	
	public void removeProductToOrder(int orderID, ProductService product) {
		
		int indexOrderID = 0;
		
		for(OrderService item : orders)
			if(item.getOrderID() != orderID)
				indexOrderID++;
		
		if(orders.get(indexOrderID).removeProduct(product))		
			System.out.println("Product " + product.getProductID() +" removed to the order " + orderID);
		else
			System.out.println("Product " + product.getProductID() +" not removed to the order " + orderID);
	}

	public void viewInfo() {
		System.out.println("UserID:" + userID + ", " + firstname + " " + lastname);
	}
}
