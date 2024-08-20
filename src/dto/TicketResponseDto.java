package dto;

import models.VehicleType;

public class TicketResponseDto {
	private String vehilceNumber;
	private VehicleType vehicleType;
	private int gateID;

	
	public String getVehilceNumber() {
		return vehilceNumber;
	}
	public void setVehilceNumber(String vehilceNumber) {
		this.vehilceNumber = vehilceNumber;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getGateID() {
		return gateID;
	}
	public void setGateID(int gateID) {
		this.gateID = gateID;
	}
	
	
	
}
