package Esercizio_5;

public class ContoCorrente{
	
	private int periodoAttività;
	private double capitaleIniziale, tassoInteresse;
	
	public ContoCorrente() {
	}

	public ContoCorrente(int periodoAttività, double capitaleIniziale, double tassoInteresse) {
		this.periodoAttività = periodoAttività;
		this.capitaleIniziale = capitaleIniziale;
		this.tassoInteresse = tassoInteresse;
	}
	
	public int getPeriodoAttività() {
		return periodoAttività;
	}

	public double getCapitaleIniziale() {
		return capitaleIniziale;
	}

	public double getTassoInteresse() {
		return tassoInteresse;
	}

	public void setPeriodoAttività(int periodoAttività) {
		this.periodoAttività = periodoAttività;
	}

	public void setCapitaleIniziale(double capitaleIniziale) {
		this.capitaleIniziale = capitaleIniziale;
	}

	public void setTassoInteresse(double tassoInteresse) {
		this.tassoInteresse = tassoInteresse;
	}

	public double sommaCorrente() {
		return capitaleIniziale * (1 + periodoAttività * tassoInteresse / 100);
	}
}
