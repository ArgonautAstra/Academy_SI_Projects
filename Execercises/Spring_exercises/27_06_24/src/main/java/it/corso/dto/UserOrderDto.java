package it.corso.dto;

import java.time.LocalDate;
import java.util.List;

public class UserOrderDto {

	// Attributi della classe Order senza il riferimento User che genera il loop 
	
	private int id;
	private LocalDate date;
	private double amount;
	// Riferimento di Order verso Product in DTO
	private List<UserOrderProductDto> product;
	
	public int getId() {
		return id;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public List<UserOrderProductDto> getList() {
		return product;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setList(List<UserOrderProductDto> product) {
		this.product = product;
	}
	
}
