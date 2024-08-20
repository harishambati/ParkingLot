package service;

import models.Gate;
import models.Ticket;
import models.Vehicle;
import models.VehicleType;


public class TicketService {
	
	private VehicleService vehicleService;
	
	private GateService gateService;
	
	
	public TicketService(VehicleService vehicleService, GateService gateService) {
		super();
		this.vehicleService = vehicleService;
		this.gateService = gateService;
	}

	public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType, int gateId){
		
		Ticket ticket = new Ticket();
		
		Vehicle vehicle =  vehicleService.getVehicle(vehicleNumber);
		if(vehicle == null) {
			 vehicle = vehicleService.addVehilce(vehicleNumber, vehicleType);
		}
		
		Gate gate = gateService.getGate(gateId);
		
		
		ticket.setGate(gate);
		ticket.setVehicle(vehicle);
		
		
		
		return ticket;
	}

}
