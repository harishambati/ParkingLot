package models;

import java.util.List;

public class ParkingFloor extends BaseEntity{
	
	private int floorNumber;
	
	private List<ParkingSpots> parkingSpots;

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public List<ParkingSpots> getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(List<ParkingSpots> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	
	
	
}
