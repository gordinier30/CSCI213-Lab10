/**
 * Lab 10 Car class
 * @author Christian Gordinier
 *
 */
public class Car extends Vehicle{
	private int doors, passengers;
	
	public Car(String newMake, String newModel, String newPlate, int newDoors, int newPassengers){
		super(newMake, newModel, newPlate);
		this.doors = newDoors;
		this.passengers = newPassengers;
	}
	
	public int getDoors(){
		return this.doors;
	}
	
	public int getPassengers(){
		return this.passengers;
	}
	
	public String toString() {
		String result = this.doors +"-door "+super.getMake()+" "+ super.getModel()+" with license "+ super.getPlate();
		return result;
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car other = (Car) other;
		
		if (this.getDoors() == other.getDoors() && this.getPassengers() == other.getPassengers()){
			return super.equals(other);
		}
		return false;
	}
	
	public Car copy(){
		int newDoors = this.doors;
		int newPassengers = this.passengers;
		
		Car theCpy = new Car(super.getMake(), super.getModel(), super.getPlate(), newDoors, newPassengers);
		return theCpy;
	}

}