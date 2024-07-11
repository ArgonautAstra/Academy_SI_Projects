package Esercizio_1;

public class Rettangolo extends Forma {

	private float side2;
	
	public Rettangolo(float side, float side2) {
		super(side,4);
		this.side2 = side2;
	}

	@Override
	
	public float calcPerimeter() {
		return (side * 2) + (side2 * 2);
	}

	@Override
	
	public float calcArea() {
		return side * side2;
	}

}
