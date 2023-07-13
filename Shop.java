package assignment2summer;
import java.util.Vector;
import java.util.Scanner;

public class Shop {
	private int car_count, truck_count, moto_count;
	private Vector all_vehicles;
	
	public Shop() {
		all_vehicles = new Vector();
	}
	//accessors
	public int getCar_count() {
		return car_count;
	}

	public void setCar_count(int car_count) {
		this.car_count = car_count;
	}

	public int getTruck_count() {
		return truck_count;
	}

	public void setTruck_count(int truck_count) {
		this.truck_count = truck_count;
	}

	public int getMoto_count() {
		return moto_count;
	}

	public void setMoto_count(int moto_count) {
		this.moto_count = moto_count;
	}
	
	public int getTotalCount() {
		return car_count + truck_count + moto_count;
	}
	
	public void addVehicle() {
		/*
		 * prompts for the specific type of vehicle (Car, Truck or Motorcyle)
		 * and the characteristics of it. It creates the specified instance and adds it to the collection
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the type of vehicle: ");
		String type = (scan.nextLine()).toLowerCase();
		
		System.out.println("Enter the brand: ");
		String brand = scan.nextLine();
		
		System.out.println("Enter the color of the vehicle: ");
		String color = scan.nextLine();
		
		System.out.println("Enter the date of make of the vehicle: ");
		String date = scan.nextLine();
		
		switch(type) {
			case "car":
				System.out.println("Enter the number of seats: ");
				int num_seats = scan.nextInt();
				
				System.out.println("Enter the type of the car (sedan, hatchback, SVU): ");
				String c_type = (scan.next()).toLowerCase();
				
				//Validate whether car is sedan, hatchback, or svu
				while(!(c_type.equals("sedan")||c_type.equals("hatchback")|| c_type.equals("svu"))) {
					System.out.println("Invalid. Enter the type of the car (sedan, hatchback, SVU): ");
					c_type = (scan.nextLine()).toLowerCase();
				}
				Car new_car = new Car(brand, color, date, num_seats, c_type);
				all_vehicles.add(new_car);
				car_count++;
				break;
			case "truck":
				System.out.println("Enter the number of wheels: ");
				int num_wheels = scan.nextInt();
				
				Truck new_truck = new Truck(brand, color, date, num_wheels);
				all_vehicles.add(new_truck);
				truck_count++;
				break;
			case "motorcycle":
				System.out.println("Enter the engine capacity: ");
				float engine_cap = scan.nextFloat();
				
				//Engine capacity must be between 70 and 120
				while(engine_cap<=70 || engine_cap>=120) {
					System.out.println("The engine capacity must be between 70 and 120, enter again: ");
					engine_cap = scan.nextFloat();
				}
				Motorcycle new_moto = new Motorcycle(brand, color, date, engine_cap);
				all_vehicles.add(new_moto);
				moto_count++;
				break;
			default:
				System.out.println("Invalid. You must enter car, truck, or motorcycle. ");
				break;
		}
	}
	
	public void deleteVehicle() {
		/*  prompts for the particular type of the vehicle. It then displays a numbered list of 
		 *  all the instances of this particular type.  The user will then input the line number of the item
		 *  to delete and the latter is removed from the collection. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type of vehicle you want to delete: ");
		String type = (scan.nextLine()).toLowerCase();
		
		switch(type) {
			case "car":
				int indx =1;
				for(Object o: all_vehicles){
					if(o instanceof Car) {
						System.out.println(indx);
						System.out.print((Car)o);
						indx++;
					}
				}
				System.out.println("Enter the number of the car you want to delete: ");
				int to_delete = scan.nextInt();
	
				indx =1;
				for(Object o: all_vehicles){
					if(o instanceof Car) {
						if(indx==to_delete) {
							all_vehicles.remove(o);
							car_count--;
							return;
						}
						indx++;
					}
				}
				break;
			case "truck":
				int indx2 =1;
				for(Object o: all_vehicles){
					if(o instanceof Truck) {
						System.out.println(indx2);
						System.out.print((Truck)o);
						indx2++;
					}
				}
				indx2 =1;
				System.out.println("Enter the number of the car you want to delete: ");
				int to_delete2 = scan.nextInt();
				for(Object o: all_vehicles){
					if(o instanceof Truck) {
						if(indx2==to_delete2) {
							all_vehicles.remove(o);
							truck_count--;
							return;
						}
						indx2++;
					}
				}
				break;
			case "motorcycle":
				int indx3 =1;
				for(Object o: all_vehicles){
					if(o instanceof Motorcycle) {
						System.out.println(indx3);
						System.out.print((Truck)o);
						indx3++;
					}
				}
				indx3 =1;
				System.out.println("Enter the number of the car you want to delete: ");
				int to_delete3 = scan.nextInt();
				for(Object o: all_vehicles){
					if(o instanceof Motorcycle) {
						if(indx3==to_delete3) {
							all_vehicles.remove(o);
							moto_count--;
							return;
						}
						indx3++;
					}
				}
				break;
			default:
				System.out.println("Invalid");
				return;
		}
	}
	public void displayAll() {
		/*the program prompts for the particular type and list all those vehicles
		 *  that match the type. It also displays the total count of this type
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type you want to display: ");
		String type = (scan.nextLine()).toLowerCase();
		
		switch(type) {
		case "car":
			for(Object o: all_vehicles) {
				if(o instanceof Car) {
					System.out.println((Car)o);
				}
				
			}
			System.out.println("car_count");
			break;
		case "truck":
			for(Object o: all_vehicles) {
				if(o instanceof Truck) System.out.println((Car)o);
			}
			System.out.println("truck_count");
			break;
		case "motorcycle":
			for(Object o: all_vehicles) {
				if(o instanceof Motorcycle) System.out.println((Motorcycle)o);
			}
			System.out.println("moto_count");
			break;
			
		default:
			System.out.println("Invalid");
			return;
		}
	}
	public void listAll() {
		for(Object o: all_vehicles) {
			if(o instanceof Car) {
				System.out.println((Car)o + "car");
			}
			else if(o instanceof Truck) {
				System.out.println((Truck)o + "truck");
			}
			else {
				System.out.println((Motorcycle)o + "motorcycle");
			}
		}
		
	}
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Add a vehicle\r\n"
				+ "2.Delete a vehicle\r\n"
				+ "3.Display type\r\n"
				+ "4.List all\r\n"
				+ "5.Exit\r\n"
				+ "----------------------\r\n"
				+ "Enter your choice:\r\n"
				+ "");
		int inp = scan.nextInt();
		switch(inp) {
		case 1:
			addVehicle();
			break;
		case 2:
			deleteVehicle();
			break;
			
		case 3:
			displayAll();
			break;
		case 4:
			listAll();
			break;
		case 5:
			System.out.println("Exiting.");
			return;
		default:
			System.out.println("Enter valid option");
			break;
		}
		menu();
	}
	public static void main(String[]args) {
		Shop s = new Shop();
		s.menu();
	}
}
