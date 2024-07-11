package Esercizio_3;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car.CarBuilder().setCarFrame("Fiat Frame")
				.setCarBody("Fiat Body")
				.setEngine("Volskwagen Engine")
				.setTires("Ford Tires")
				.setAirConditining("Air Conditining: Yes")
				.setNavigationSystem("Navigation System: No")
				.build();
		
		System.out.println(car.toString());
	}

}
