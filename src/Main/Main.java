package Main;

import controller.TicketController;
import dto.TicketRequestDto;
import dto.TicketResponseDto;
import models.VehicleType;
import repositories.GateRepository;
import repositories.VehicleRepository;
import service.GateService;
import service.TicketService;
import service.VehicleService;
import Utilities.*;

public class Main {

	public static void main(String[] args) {
		
		
		TicketRequestDto generateTicketRequestDto = new TicketRequestDto("123", VehicleType.Large, 1);
		GateRepository gateRepository = new GateRepository();
		GateService gateService = new GateService(gateRepository);
		VehicleRepository vehRepository = new VehicleRepository();
		VehicleService vehicleService = new VehicleService(vehRepository);
		TicketService ticketService = new TicketService(vehicleService,gateService );
		TicketController ticketController = new TicketController(ticketService);
		
		TicketResponseDto ticketResponseDto  = ticketController.getTicket(generateTicketRequestDto);
		
		TicketPrinter.PrintTicket(ticketResponseDto);
		
	}

}
 