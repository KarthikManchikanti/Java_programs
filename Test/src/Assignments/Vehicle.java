package Assignments;

public class Vehicle {

	String manufacturer, engine;
	int seats,fuel;
	
	public Vehicle(String manufacturer,String engine, int seats, int fuel)
	{
		this.manufacturer=manufacturer;
		this.engine=engine;
		this.seats=seats;
		this.fuel=fuel;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public void helper()
	{
		System.out.println(manufacturer+ seats + engine + fuel);
	}
	
}
