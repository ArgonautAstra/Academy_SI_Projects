package Esercizio_4;

public class TriangoloScaleno extends Triangolo {
	
	private float side1, side2;
	
	public TriangoloScaleno(float base, float side1, float side2) {
		super(base);
		
		if((base + side1 >= side2) && (base + side2 >= side1) && (side1 + side2 >= base)) {
			this.side1 = side1;
			this.side2 = side2;
		}else {
			base = 0;
			System.out.println("Il triangolo non esiste");		
		}
	}

	public float calcPerimeter() {
		return base + side1 + side2;
	}

	public float calcArea() {
		float tmp = calcPerimeter()/2;
		return (float) Math.sqrt(tmp * (tmp - base) * (tmp - side1) * (tmp - side2));
	}

}
