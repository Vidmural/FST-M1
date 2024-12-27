package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTakeOffTime;
	private Date lastLandingTime;

	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<String>();
	}

	public void onboard(String passengerName) {
		this.passengers.add(passengerName);
	}

	public void setTakeOff() {
		this.lastTakeOffTime = new Date();
	}

	public Date getTakeOff() {
		return this.lastTakeOffTime;
	}

	public void setLand() {
		this.lastLandingTime = new Date();
		this.passengers.clear();
	}

	public Date getLastTimeLanded() {
		return this.lastLandingTime;
	}

	public List<String> getPassengers() {
		return this.passengers;
	}
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// create object of plane

		Plane b747 = new Plane(10);

		// Onboard Passengers
		b747.onboard("Vidya");
		b747.onboard("Sumukha");
		b747.onboard("Lishika");
		b747.onboard("Trijal");

		// Set the take off time
		b747.setTakeOff();
		System.out.println("Plane took off at: " + b747.getTakeOff());

		System.out.println("Passengers on the plane: " + b747.getPassengers());

		// Flying.....
		System.out.println("Plane is flying.....");
		Thread.sleep(5000);

		// set the landing time
		b747.setLand();

		System.out.println("Plane landed at: " + b747.getLastTimeLanded());
		System.out.println("Passengers on the plane after landing: " + b747.getPassengers());
	}
}