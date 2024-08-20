package repositories;

import java.util.HashMap;
import java.util.Map;

import models.Vehicle;
import models.VehicleType;

public class VehicleRepository {
	
	
	private Map<String, Vehicle> vehicleDb = new HashMap<String, Vehicle>();	
	
	
	public Vehicle getVehilce(String vehilceNumber){
		
		return vehicleDb.get(vehilceNumber);
		
	}
	

	public Vehicle registerVehicle(String vehilceNumber, VehicleType type){
		
		Vehicle vehicle = new Vehicle(vehilceNumber, type);
		vehicleDb.put(vehilceNumber ,vehicle);
		
		return vehicle;
		
	}
	
}
