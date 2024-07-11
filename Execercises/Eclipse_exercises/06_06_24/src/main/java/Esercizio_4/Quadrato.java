package Esercizio_4;

public class Quadrato implements Forma {

	private float side;
	
	public Quadrato(float side) {
		this.side = side;
	}

	public float calcArea() {
		return side * side;
	}

	public float calcPerimeter() {
		return side * 4;
		
	}
}
