package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(String color, String transmission, int make) {
		this.transmission = transmission;
		this.tyres = 4;
		this.doors = 4; 
		this.make = make;
		this.color = color;
	}

	public void displayCharacteristics() {
		System.out.println("Color :" + color);
		System.out.println("Transmission Type :" + transmission);
		System.out.println("Year of making :" + make);
		System.out.println("Number of Tyres :" + tyres);
		System.out.println("Number of Doors :" + doors);		
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward !!");
	}
	
	public void brake() {
		System.out.println("Car has stopped !!");
	}
	
}
