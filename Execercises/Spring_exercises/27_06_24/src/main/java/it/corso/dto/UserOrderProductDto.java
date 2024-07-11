package it.corso.dto;

public class UserOrderProductDto {

	// Attributi della classe Product senza il riferimento Order che genera il loop 
	
	private int id;
	private String name;
	private double price;
	// Riferimento di Product verso Category in DTO
	private UserOrderProductCategoryDto category;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public UserOrderProductCategoryDto getCategory() {
		return category;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setCategory(UserOrderProductCategoryDto category) {
		this.category = category;
	}

}
