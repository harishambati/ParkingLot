package models;

import java.util.List;

public class ParkingLot extends BaseEntity{

	private List<ParkingFloor> floors;
	
	private List<Gate> gates;
	
	private Address address;
	
	public List<ParkingFloor> getFloors() {
		return floors;
	}
	public void setFloors(List<ParkingFloor> floors) {
		this.floors = floors;
	}
	public List<Gate> getGates() {
		return gates;
	}
	public void setGates(List<Gate> gates) {
		this.gates = gates;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
		
}
