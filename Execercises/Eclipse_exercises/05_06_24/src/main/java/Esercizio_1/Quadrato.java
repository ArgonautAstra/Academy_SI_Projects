package Esercizio_1;

public class Quadrato extends Forma {

	public Quadrato(float side) {
		super(side,4);
	}

	@Override
	
	public float calcArea() {
		return side * side;
	}
}
