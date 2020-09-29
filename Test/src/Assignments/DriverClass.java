package Assignments;

public class DriverClass {

	public static void main(String[] args) {

		Car car = new Car("Honda","turbo",4,4);
		Car car1 = new Car("Honda","turbo",4,4,"black");
		System.out.println(car1.getColor());
		
	}

}
