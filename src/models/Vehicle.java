package models;

public class Vehicle extends BaseEntity{
	
	private String number;
	
	private VehicleType vehicleType;

	public Vehicle(String vehilceNumber, VehicleType type) {
		this.number = vehilceNumber;
		this.vehicleType = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
}
