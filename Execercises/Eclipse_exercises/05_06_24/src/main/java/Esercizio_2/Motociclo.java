package Esercizio_2;

public class Motociclo extends Veicolo {

	private int cilindrata;

	public Motociclo() {
		super();
	}

	public Motociclo(String targa, String marca, String modello, boolean guasto, int cilindrata) {
		super(targa, marca, modello, guasto);
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return super.toString() + ". Il veicolo è un " + cilindrata;
	}
}
