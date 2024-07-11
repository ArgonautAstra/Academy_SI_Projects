package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "Article")
public class Article {

	// @Id identify the column that is the Primary Key.
	//
	// @GeneratedValue with 'strategy' specify how the Primary Key must be generate.
	// With 'IDENTITY' we are specifying that value must be generate as is generated 
	// by the DB, in this case AUTO_INCREMENT.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	// @Column specify the respective column of the table of the variable if this 
	// last have a different name.
	
	@Column(name = "name_article")
	@Pattern(regexp = "[a-zA-Z\\s']{3,20}", message = "Incorrect article name")
	private String name_article;

	@Column(name = "price_article")
	@Min(value = 0, message = "Incorrect price, it couldn't be negative")
	private double price_article;

	public int getId() {
		return id;
	}
	
	public String getName_article() {
		return name_article;
	}

	public double getPrice_article() {
		return price_article;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName_article(String name_article) {
		this.name_article = name_article;
	}

	public void setPrice_article(double price_article) {
		this.price_article = price_article;
	}

	@Override
	public String toString() {
		return "\nArticle: "
				+ "\nid_article = " + id
				+ ",\nname_article = " + name_article 
				+ ",\nprice_article = " + price_article 
				+ "\nADDED\n";
	}
	
	
}
