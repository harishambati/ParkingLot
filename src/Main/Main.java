package Main;

import controller.TicketController;
import dto.GenerateTicketRequestDto;
import models.VehicleType;
import service.TicketService;

public class Main {

	public static void main(String[] args) {
		
		
		GenerateTicketRequestDto generateTicketRequestDto = new GenerateTicketRequestDto("123", VehicleType.Large, 1);
		TicketService ticketService = new TicketService();
		TicketController ticketController = new TicketController(ticketService);
		
		
	}

}
