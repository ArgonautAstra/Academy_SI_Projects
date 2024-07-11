package com.example.testmaven.it.spinelli.andrea;

public class Concatena {

	private String name,surname;
	private boolean flag;
	
	public Concatena() {}

	public Concatena(String name, String surname, boolean flag) {
		this.name = name;
		this.surname = surname;
		this.flag = flag;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public String concat() {
		if(flag){
			return name.toUpperCase() + " " + surname.toUpperCase();
		}else {
			return name.toLowerCase() + " " + surname.toLowerCase();
		}
	}
	
	public String sottoStringa(String name) {
		
		if(name.length() > 3){
			return name.substring(0,3);
		}else{
			return name;
		}
	}
}
