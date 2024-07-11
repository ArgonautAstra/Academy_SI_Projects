package Esercizio_4;

public class TriangoloEquilatero extends Triangolo {
	
	public TriangoloEquilatero(float base) {
		super(base);
	}

	public float calcPerimeter() {
		return base * 3;
	}

	public float calcArea() {
		float height = (float) Math.sqrt((base * base) - (base/2 * base/2));
		return base * height / 2;
	}

}
