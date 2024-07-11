package Esercizio_3;

public class Car {
	private String carFrame;
	private String carBody;
	private String engine;
	private String tires;
	private String airConditioning;
	private String navigationSystem;

	public Car(CarBuilder carBuilder) {
		this.carFrame = carBuilder.carFrame;
		this.carBody = carBuilder.carBody;
		this.engine = carBuilder.engine;
		this.tires = carBuilder.tires;
		this.airConditioning = carBuilder.airConditioning;
		this.navigationSystem = carBuilder.navigationSystem;
	}
	
	public static class CarBuilder {
		private String carFrame;
		private String carBody;
		private String engine;
		private String tires;
		private String airConditioning;
		private String navigationSystem;
		
		public CarBuilder setCarFrame(String carFrame) {
			this.carFrame = carFrame;
			return this;
		}
		public CarBuilder setCarBody(String carBody) {
			this.carBody = carBody;
			return this;
		}
		public CarBuilder setEngine(String engine) {
			this.engine = engine;
			return this;
		}
		public CarBuilder setTires(String tires) {
			this.tires = tires;
			return this;
		}
		public CarBuilder setAirConditining(String airConditioning) {
			this.airConditioning = airConditioning;
			return this;
		}
		public CarBuilder setNavigationSystem(String navigationSystem) {
			this.navigationSystem = navigationSystem;
			return this;
		}	
		public Car build() {
			return new Car(this);
		}
	}
	
	@Override
	public String toString() {
		return "Car builded:\n" + carFrame + "\n" + 
				 carFrame + "\n" + 
				 carBody + "\n" + 
				 engine + "\n" + 
				 tires + "\n" + 
				 airConditioning + "\n" +
				 navigationSystem;
	}
}
