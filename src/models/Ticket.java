package models;

import java.util.Date;

public class Ticket extends BaseEntity{

	    private Date entryTime;
	    
	    private Vehicle vehicle;
	    
	    private ParkingSpots  parkingSpot;
	    
	    private Gate gate;

		public Date getEntryTime() {
			return entryTime;
		}

		public void setEntryTime(Date entryTime) {
			this.entryTime = entryTime;
		}

		public Vehicle getVehicle() {
			return vehicle;
		}

		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}

		public ParkingSpots getParkingSpot() {
			return parkingSpot;
		}

		public void setParkingSpot(ParkingSpots parkingSpot) {
			this.parkingSpot = parkingSpot;
		}

		public Gate getGate() {
			return gate;
		}

		public void setGate(Gate gate) {
			this.gate = gate;
		}
	    
	    
	    
	    
}
