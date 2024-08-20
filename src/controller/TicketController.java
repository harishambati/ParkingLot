package controller;

import dto.TicketRequestDto;
import dto.TicketResponseDto;
import models.Ticket;
import service.TicketService;

public class TicketController {

	private TicketService ticketService;
	
	public TicketController(TicketService ticketServices) 
	{
		this.ticketService = ticketServices;
	}

	public TicketResponseDto getTicket(TicketRequestDto generateTicketRequestDto){
		
		Ticket ticket = ticketService.generateTicket(generateTicketRequestDto.getVehicleNumber(),
				generateTicketRequestDto.getVehicleType(),
				generateTicketRequestDto.getGateId());
		
		
		TicketResponseDto ticketResponseDto = new TicketResponseDto();
		ticketResponseDto.setVehicleType(ticket.getVehicle().getVehicleType());
		ticketResponseDto.setVehilceNumber(ticket.getVehicle().getNumber());
		ticketResponseDto.setGateID(ticket.getGate().getGateNo());
		
		return ticketResponseDto;
	
	}
	
	
	
	
}
