package com.example.demo.model;

public class Article {
	
	private int id;
	private String description;
	private float price;
	
	public Article(int id, String description, float price) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", description=" + description + ", price=" + price + "]";
	}
}
