package Esercizio_2;

public abstract class Transport {
	
	protected double speed;
	
	public Transport(double speed) {
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public abstract void start();
	
	public abstract void stop();
	
	public abstract float calculateCost(double distance);
}
