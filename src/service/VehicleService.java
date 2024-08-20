package service;

import models.Vehicle;
import models.VehicleType;
import repositories.VehicleRepository;

public class VehicleService {
	
	private VehicleRepository vehicleRepository;
	
	
	
	public VehicleService(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}

	
	public Vehicle getVehicle(String number) {
		return vehicleRepository.getVehilce(number);
	}
	
	public Vehicle addVehilce(String number, VehicleType vehicleType) {
		return vehicleRepository.registerVehicle(number, vehicleType);
	}
	
}
