
 class Car extends Vehicle {
	 
	 static int FUEL_CAPACITY = 50;
	 private int fuel;
	 
	 public Car(int fuel){
		 this.fuel = fuel;
	 }
	 
	 
	  public int calculateMaintenanceCost() {
		return FUEL_CAPACITY-fuel;
	 }

	  
	
		
	
	 
	 
	 
	 
	 
}
