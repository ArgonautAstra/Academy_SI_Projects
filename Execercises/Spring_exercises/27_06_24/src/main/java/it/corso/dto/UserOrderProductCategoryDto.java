package it.corso.dto;

public class UserOrderProductCategoryDto {

	// Attributi della classe Category senza il riferimento Product che genera il loop 
	
	private int id;
	private String description;
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
