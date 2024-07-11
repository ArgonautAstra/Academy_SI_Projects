package Esercizio_4;

public class Rettangolo implements Forma {

	private float side, side2;
	
	public Rettangolo(float side, float side2) {
		this.side = side;
		this.side2 = side2;
	}

	public float calcArea() {
		return side * side2;
	}

	public float calcPerimeter() {
		return side * 2 + side2 * 2;
		
	}

}
