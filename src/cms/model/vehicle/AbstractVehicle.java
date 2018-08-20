package cms.model.vehicle;

public abstract class AbstractVehicle {
		private String registrationNumber;
		private int year;
		private String make;
		private String model;
		private double usage;
		private double lastServicePoint;
		private double serviceInterval;
		
		public AbstractVehicle(String registrationNumber, String make, String model, int year,
				double usage, double serviceInterval) {
			super();
			this.registrationNumber = registrationNumber;
			this.year = year;
			this.make = make;
			this.model = model;
			
			this.usage = usage;
			this.serviceInterval = serviceInterval;
		}

		

		public String getRegistrationNumber() {
			return registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public double getUsage() {
			return usage;
		}

		public void setUsage(double usage) {
			this.usage = usage;
		}

		public double getLastServicePoint() {
			return lastServicePoint;
		}

		public void setLastServicePoint(double lastServicePoint) {
			this.lastServicePoint = lastServicePoint;
		}

		public double getServiceInterval() {
			return serviceInterval;
		}

		public void setServiceInterval(double serviceInterval) {
			this.serviceInterval = serviceInterval;
		}
		
		
		
		
}
