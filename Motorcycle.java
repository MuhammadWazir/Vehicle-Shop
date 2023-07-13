package assignment2summer;

/**
 * Represents a Motorcycle, which is a type of Vehicle.
 */
public class Motorcycle extends Vehicle {
	private float engine_cap;
	
	/*
	 * Constructs a Motorcycle object with the specified brand name, color, date of make, and engine capacity.
	 */
	public Motorcycle(String b, String c, String d, float e) {
		super(b, c, d);
		engine_cap = e;
	}
	//accessors
	public float getEngine_cap() {
		return engine_cap;
	}
	public void setEngine_cap(float engine_cap) {
		this.engine_cap = engine_cap;
	}
	//String representation
	public String toString() {
		return "Brand Name: " + brand_name +
		       "\nColor: " + color +
		       "\nDate of Make: " + date_of_make +
		       "\nEngine Capacity: " + engine_cap;
	}
}
