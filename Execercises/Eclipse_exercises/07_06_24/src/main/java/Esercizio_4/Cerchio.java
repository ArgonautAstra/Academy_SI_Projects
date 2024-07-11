package Esercizio_4;

public class Cerchio implements Forma {

	private float radius;
	
	public Cerchio(float radius) {
		this.radius = radius;
	}

	public float calcArea() {
		return (float) (Math.PI * Math.pow(radius, 2));
	}

	public float calcPerimeter() {
		return (float) (2* Math.PI * radius);
		
	}
	
}
