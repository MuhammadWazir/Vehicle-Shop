package assignment2summer;

/**
 * Represents a Car, which is a type of Vehicle.
 */
public class Car extends Vehicle {
	private int num_seats;
	private String car_type;
	
	/*
	 * Constructs a Car object with the specified brand name, color, date of make, number of seats, and car type.
	 */
	public Car(String b, String c, String d, int n, String t) {
		super(b, c, d);
		num_seats = n;
		car_type = t;
	}
	//accessors
	public int getNum_seats() {
		return num_seats;
	}
	public void setNum_seats(int num_seats) {
		this.num_seats = num_seats;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	//String representation
	public String toString() {
		return "Brand Name: " + brand_name +
		       "\nColor: " + color +
		       "\nDate of Make: " + date_of_make +
		       "\nNumber of Seats: " + num_seats +
		       "\nCar Type: " + car_type;
	}
}

