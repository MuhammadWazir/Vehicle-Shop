package assignment2summer;

/**
 * Represents a Truck, which is a type of Vehicle.
 */
public class Truck extends Vehicle {
	private int num_wheels;
	
	/*
	 * Constructs a Truck object with the specified brand name, color, date of make, and number of wheels.
	 */
	public Truck(String b, String c, String d, int n) {
		super(b, c, d);
		num_wheels = n;
	}

	//accessors
	public int getNum_wheels() {
		return num_wheels;
	}
	public void setNum_wheels(int num_wheels) {
		this.num_wheels = num_wheels;
	}
	//String representation
	public String toString() {
		return "Brand Name: " + brand_name +
		       "\nColor: " + color +
		       "\nDate of Make: " + date_of_make +
		       "\nNumber of Wheels: " + num_wheels;
	}
}

