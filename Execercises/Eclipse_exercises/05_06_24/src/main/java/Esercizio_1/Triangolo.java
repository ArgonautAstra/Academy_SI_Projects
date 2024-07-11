package Esercizio_1;

public class Triangolo extends Forma{
	
	public Triangolo(float side) {
		super(side,3);
	}

	@Override
	
	public float calcArea() {
		
		float height = (float) (Math.sqrt(Math.pow(side/2, 2) + Math.pow(side, 2)));
		
		return side * height / 2;
	}
}
