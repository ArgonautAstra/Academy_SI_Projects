package Esercizio_5;

public class ContoCorrenteComposto extends ContoCorrente{

	public ContoCorrenteComposto() {
		super();
	}

	public ContoCorrenteComposto(int periodoAttività, double capitaleIniziale, double tassoInteresse) {
		super(periodoAttività, capitaleIniziale, tassoInteresse);
	}
	
	@Override
	
	public double sommaCorrente() {
		return super.getCapitaleIniziale() * Math.pow(1 + super.getTassoInteresse() / 100, super.getPeriodoAttività());
	}
}
