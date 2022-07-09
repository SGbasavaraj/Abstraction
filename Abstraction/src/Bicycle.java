
public class Bicycle extends Vehicle {
	
	static int AIR_CAPACITY = 20;
	private int air;
	
	public Bicycle(int air) {
		this.air=air;
	}
	
	public int calculateMaintenanceCost() {
		return AIR_CAPACITY-air;
	}
	

}
