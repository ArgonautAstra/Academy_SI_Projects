package Esercizio_4;

public class Cittadino{
	
	protected Preferenza voto;
	protected int eta;

	public Cittadino(int eta) {
		voto = Preferenza.NULLO;
		this.eta = eta;
	}

	public Preferenza getVoto() {
		return voto;
	}

	public void setVoto(Preferenza voto) {
		this.voto = voto;
	}	
}
