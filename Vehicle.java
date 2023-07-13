package assignment2summer;

/**
 * Abstract class representing a Vehicle.
 */
public abstract class Vehicle {
	protected String brand_name, color, date_of_make;
	
	/*
	 * Constructor to initialize a Vehicle object with the specified brand name, color, and date of make.
	 */
	public Vehicle(String b, String c, String d) {
		brand_name = b;
		color = c;
		date_of_make = d;
	}
	//accessors
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getDate_of_make() {
		return date_of_make;
	}
	public void setDate_of_make(String date_of_make) {
		this.date_of_make = date_of_make;
	}
}

