package Utilities;

import dto.TicketResponseDto;
import models.Ticket;

public class TicketPrinter {
	
	public static void PrintTicket(TicketResponseDto ticketResponseDto) {
		System.out.println("Gate Id :"+ ticketResponseDto.getGateID());
		System.out.println("Vehicle Number :"+ ticketResponseDto.getVehilceNumber());
		System.out.println("Vehicle Type : "+ticketResponseDto.getVehicleType());
		//System.out.println("Assigned Spot : "+ticketResponseDto.getVehicleType());
	}
}
