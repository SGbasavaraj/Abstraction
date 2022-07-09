
public class TestVehicle{
	
	public static void main(String[] args) {
		
		Vehicle c1 = new Car(25);
		Vehicle v2 = new Bicycle(10);
		
		System.out.println(c1.calculateMaintenanceCost());
		//System.out.println(v2.calculateMaintenanceCost());
		 
		
		System.out.println(c1.moveForward(2));
		System.out.println(v2.moveForward(3));
	}
	
	
	
	
}
