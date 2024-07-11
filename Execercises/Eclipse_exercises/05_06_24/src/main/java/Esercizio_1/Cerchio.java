package Esercizio_1;

public class Cerchio extends Forma {

	public Cerchio(float side) {
		super(side,0);
	}

	@Override
	
	public float calcArea() {
		return (float) (Math.PI * Math.pow(side, 2));
	}
	
}
