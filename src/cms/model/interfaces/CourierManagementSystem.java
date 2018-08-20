package cms.model.interfaces;

import java.util.Map;

import cms.model.vehicle.AbstractVehicle;


public interface CourierManagementSystem {

	boolean scheduleJob(double distance, String reg);

	void addVehicle(AbstractVehicle vehicle);

	void displayVehicleInfo(String string);

	void displayAllVehicles();

	void serviceVehicle(String string);

	void displayAllJobs();
	
	public Map<Integer, Double> getJobs();

}
