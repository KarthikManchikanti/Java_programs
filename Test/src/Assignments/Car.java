package Assignments;

public class Car extends Vehicle {

	String color;
	public Car(String manufacturer, String engine, int seats, int fuel, String color) {
		super(manufacturer, engine, seats, fuel);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Car(String manufacturer, String engine, int seats, int fuel) {
		super(manufacturer, engine, seats, fuel);
	}

}
