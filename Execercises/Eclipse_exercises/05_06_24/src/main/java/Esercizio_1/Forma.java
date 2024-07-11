package Esercizio_1;

public class Forma {
	
	protected float side; 
	protected int nSide;

	public Forma(float side, int nSide) {
		this.side = side;
		this.nSide = nSide;
	}

	public float calcPerimeter() {
		if(nSide != 0)
			return side*nSide;
		else
			return side * (float) Math.PI * 2;
	}
	
	public float calcArea() {
		return (float) Math.PI;
	}
	
}
