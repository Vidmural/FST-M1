package activities;

public class Activity1 {
	public static void main(String[] args) {
		Car carobj = new Car("Red", "Manual", 2022);
        System.out.println();
        carobj.displayCharacteristics();
        carobj.accelerate();
        carobj.brake();
        
	}

}
