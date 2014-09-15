
public class ACMEBicycle implements BicycleInterface {
	
	int candence = 0;
	int speed = 0;
	int gear = 1;

	@Override
	public void changeCadence(int newValue) {
		candence = newValue;
		
	}

	@Override
	public void changeGear(int newValue) {
		gear = newValue;
		
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
		
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
		
	}
	
	void printStates() {
		System.out.println("candence: " + candence + " speed: " + speed + " gear: " + gear);
	}
	
	

}
