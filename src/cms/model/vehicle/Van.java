package cms.model.vehicle;

public class Van extends AbstractVehicle{

	public Van(String registrationNumber, String make, String model, int year, double d,
			double e) {
		super(registrationNumber, make, model, year, d, e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Van: Reg_Number: " + getRegistrationNumber() + ", Make: " + this.getMake() + ", Model: "
				+ getModel() + ", Year: " + this.getYear()+ "\nOdometer: " + getUsage() + "km, Last Service:"
				+ getLastServicePoint() + "km, Service Interval :" + getServiceInterval() +"km";
	}

	

	

}
