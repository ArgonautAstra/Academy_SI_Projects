package com.example.testmaven.it.spinelli.andrea;

public class Conto{
	
	private String name, surname, IBAN, bankName;
	private float money;
	
	public Conto(String name, String surname, String IBAN, String bankName, float money) {
		this.name = name;
		this.surname = surname;
		this.IBAN = IBAN;
		this.bankName = bankName;
		this.money = money;
	}

	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public float getMoney() {
		return money;
	}
	
	@Override
	public String toString() {
		return "Conto [name=" + name + ", surname=" + surname + ", IBAN=" + IBAN + ", bankName=" + bankName + ", money="
				+ money + "]";
	}

	public String withdraw(int money) {
		if(this.money > money) {
			this.money -= money;
			return toString();
		}else {
			return "Soldi insufficienti, vai a lavorare!";
		}
	}
	
	public String deposit(int money) {
		if(money > 0) {
			this.money += money;
			return toString();
		}else {
			return "Non puoi inserire questa quantita' di denaro!";
		}
	}
}
