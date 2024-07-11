package Esercizio_3;

public class Vettura extends Veicolo {
	
	private String tipologia;

	public Vettura() {
		super();
	}

	public Vettura(String targa, String marca, String modello, boolean guasto, String tipologia) {
		super(targa, marca, modello, guasto);
		this.tipologia = tipologia;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public String toString() {
		return super.toString() + ". Il veicolo è un/a " + tipologia;
	}
	
}
