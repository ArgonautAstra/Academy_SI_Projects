package Esercizio_4;

public class TriangoloIsoscele extends Triangolo {
	
	private float side;
	
	public TriangoloIsoscele(float base, float side) {
		super(base);
		this.side = side;
	}

	public float calcPerimeter() {
		return base + side + side;
	}

	public float calcArea() {
		float height = (float) Math.sqrt((side * side) - (base/2 * base/2));
		return base * height / 2;
	}

}
