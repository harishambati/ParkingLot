package dto;

import models.VehicleType;

public class GenerateTicketRequestDto {
	
	private String vehicleNumber;
	
	private VehicleType vehicleType;
	
	private int gateId;

	
	
	public GenerateTicketRequestDto(String vehicleNumber, VehicleType vehicleType, int gateId) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.gateId = gateId;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getGateId() {
		return gateId;
	}

	public void setGateId(int gateId) {
		this.gateId = gateId;
	}
	
	
	
}
