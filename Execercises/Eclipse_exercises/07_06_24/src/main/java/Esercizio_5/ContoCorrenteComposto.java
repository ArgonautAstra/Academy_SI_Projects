package Esercizio_5;

public class ContoCorrenteComposto implements ContoCorrente{
	
	private int periodoAttivita;
	private double capitaleIniziale, tassoInteresse;
	
	public ContoCorrenteComposto(int periodoAttivita, double capitaleIniziale, double tassoInteresse) throws ContoCorrenteConstructorException{
		this.setPeriodoAttivita(periodoAttivita);
		this.setCapitaleIniziale(capitaleIniziale);
		this.setTassoInteresse(tassoInteresse);
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

	public void setPeriodoAttivita(int periodoAttivita) throws ContoCorrenteConstructorException{
		
		if(periodoAttivita > 0)
			this.periodoAttivita = periodoAttivita;
		else
			throw new ContoCorrenteConstructorException("Contructor error: periodo attività inserito negativo!");
	}

	public void setCapitaleIniziale(double capitaleIniziale) {
		this.capitaleIniziale = capitaleIniziale;
	}

	public void setTassoInteresse(double tassoInteresse) throws ContoCorrenteConstructorException{
		
		if(tassoInteresse > 0)
			this.tassoInteresse = tassoInteresse;
		else
			throw new ContoCorrenteConstructorException("Contructor error: tassod'interesse inserito negativo!");
	}
	
	public double sommaCorrente() {
		return capitaleIniziale * Math.pow(1 + tassoInteresse / 100, periodoAttivita);
	}
}
