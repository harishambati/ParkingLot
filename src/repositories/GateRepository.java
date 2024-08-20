package repositories;

import java.util.HashMap;
import java.util.Map;

import models.Gate;
import models.GateType;

public class GateRepository {

	private Map<Integer, Gate> gateDb;
	
	
	public GateRepository() {
		gateDb = new HashMap<>();
	}
	
	public Gate getGate(int gateId){
			return gateDb.get(gateId);
	}
	
	public Gate RegisterGate(int gateId , GateType gateType){
			Gate gate = new Gate(gateId, gateType);
			gateDb.put(gateId, gate);
			return gate;
	}
	
}
