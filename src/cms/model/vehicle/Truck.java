package cms.model.vehicle;

public class Truck extends AbstractVehicle {
	
	private int capacity;
	
	public Truck(String registrationNumber, String make, String model, int year, double lastServicePoint,
			double serviceInterval,int capacity) {
		super(registrationNumber, make, model, year, lastServicePoint, serviceInterval);
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
	}
	

	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "Truck: Reg_Number: " + getRegistrationNumber() + ", Make: " + this.getMake() + ", Model: "
				+ getModel() + ", Year: " + this.getYear()+", Capacity: " + getCapacity() + "t\n" + "Service History: " + " Odometer: " + getUsage() + "km, Last Service:"
				+ getLastServicePoint() + "km, Service Interval :" + getServiceInterval() +"km";
	}

	

}
