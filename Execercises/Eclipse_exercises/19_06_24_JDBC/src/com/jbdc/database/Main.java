package com.jbdc.database;

public class Main {

	public static void main(String[] args) {

		Database db = new Database();
		
		db.openConnection();
		
		db.query("SELECT * FROM employees ");
		
		db.closeConnection();
	}
	
}
