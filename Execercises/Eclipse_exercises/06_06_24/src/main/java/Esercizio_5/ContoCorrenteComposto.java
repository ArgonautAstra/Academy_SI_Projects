package Esercizio_5;

public class ContoCorrenteComposto implements ContoCorrente{
	
	private int periodoAttivita;
	private double capitaleIniziale, tassoInteresse;
	
	public ContoCorrenteComposto(int periodoAttivita, double capitaleIniziale, double tassoInteresse) {
		this.periodoAttivita = periodoAttivita;
		this.capitaleIniziale = capitaleIniziale;
		this.tassoInteresse = tassoInteresse;
	}
	
	public int getPeriodoAttivita() {
		return periodoAttivita;
	}

	public double getCapitaleIniziale() {
		return capitaleIniziale;
	}

	public double getTassoInteresse() {
		return tassoInteresse;
	}

	public void setPeriodoAttivita(int periodoAttivita) {
		this.periodoAttivita = periodoAttivita;
	}

	public void setCapitaleIniziale(double capitaleIniziale) {
		this.capitaleIniziale = capitaleIniziale;
	}

	public void setTassoInteresse(double tassoInteresse) {
		this.tassoInteresse = tassoInteresse;
	}
	
	public double sommaCorrente() {
		return capitaleIniziale * Math.pow(1 + tassoInteresse / 100, periodoAttivita);
	}
}
