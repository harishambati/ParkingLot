package service;

import models.Gate;
import models.GateType;
import repositories.GateRepository;

public class GateService {
	
	private GateRepository  gateRepository;
	
	
	public GateService(GateRepository gateRepository) {
		super();
		this.gateRepository = gateRepository;
		gateRepository.RegisterGate(1, GateType.ENTRANCE);
		gateRepository.RegisterGate(2, GateType.EXIT);
		
	}

	public Gate getGate(int gateId){
		return gateRepository.getGate(gateId);
	}
	
}
