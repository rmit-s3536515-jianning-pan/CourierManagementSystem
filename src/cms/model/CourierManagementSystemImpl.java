package cms.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cms.model.interfaces.CourierManagementSystem;
import cms.model.vehicle.AbstractVehicle;

public class CourierManagementSystemImpl implements CourierManagementSystem {

	private List<AbstractVehicle> vehicles = new ArrayList<>();
	private Map<Integer,Double> jobs = new HashMap<>();
	private static int id = 0;
	
	public CourierManagementSystemImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Map<Integer, Double> getJobs() {
		return jobs;
	}

	

	@Override
	public boolean scheduleJob(double distance, String reg) {
		// TODO Auto-generated method stub
		
		for(AbstractVehicle v : vehicles) {
			if(v.getRegistrationNumber().equals(reg)) {
				double odo = v.getUsage()+distance;
				if(odo <=v.getLastServicePoint()+v.getServiceInterval()) {
					v.setUsage(odo);
					jobs.put(id++, distance);
					return true;
				}
				
			}
		}
		id = id +1;
		return false;
	}

	@Override
	public void addVehicle(AbstractVehicle vehicle) {
		// TODO Auto-generated method stub
		vehicles.add(vehicle);
	}

	@Override
	public void displayVehicleInfo(String string) {
		// TODO Auto-generated method stub
		for(AbstractVehicle v : vehicles) {
			if(v.getRegistrationNumber().equals(string)) {
				System.out.println(v);
				return;
			}
		}
	}

	@Override
	public void displayAllVehicles() {
		// TODO Auto-generated method stub
		for(AbstractVehicle v : vehicles) {
			System.out.println(v);
		}
	}

	@Override
	public void serviceVehicle(String string) {
		// TODO Auto-generated method stub
		for(AbstractVehicle av : vehicles) {
			if(av.getRegistrationNumber().equals(string)) {
				av.setLastServicePoint(av.getUsage());
				return;
			}
		}
	}

	@Override
	public void displayAllJobs() {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, Double> e : jobs.entrySet()) {
			System.out.println("ID : " + e.getValue() + ", Distance : " + e.getValue());
		}
	}

}
