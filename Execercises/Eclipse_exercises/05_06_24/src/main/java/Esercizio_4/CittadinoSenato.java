package Esercizio_4;

public class CittadinoSenato extends Cittadino{

	private Preferenza votoSenato;
	
	public CittadinoSenato(int eta) {
		super(eta);
		votoSenato = Preferenza.NULLO;
	}

	public Preferenza getVoto() {
		return votoSenato;
	}

	public void setVotoCamera(Preferenza votoC) {
		super.setVoto(votoC);
	}	

	public void setVotoSenato(Preferenza votoS) {
		votoSenato = votoS;
	}	
}
