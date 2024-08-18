package models;

import java.util.List;

public class ParkingSpots extends BaseEntity {

	private ParkingSpotStatus parkingSpotStatus; 
	
	private List<VehicleType> vehilceTypes;
	
	private ParkingFloor parkingFloor;
	
	
	public ParkingSpotStatus getParkingSpotStatus() {
		return parkingSpotStatus;
	}

	public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
		this.parkingSpotStatus = parkingSpotStatus;
	}

	public List<VehicleType> getVehilceTypes() {
		return vehilceTypes;
	}

	public void setVehilceTypes(List<VehicleType> vehilceTypes) {
		this.vehilceTypes = vehilceTypes;
	}

	public ParkingFloor getParkingFloor() {
		return parkingFloor;
	}

	public void setParkingFloor(ParkingFloor parkingFloor) {
		this.parkingFloor = parkingFloor;
	}
	
	
	
	
}
