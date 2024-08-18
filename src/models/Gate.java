package models;

public class Gate extends BaseEntity{
	
	private Operator operator;
	
	private GateStatus gateStatus;
	
	private GateType gateType;
	
	private int gateNo;

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public GateStatus getGateStatus() {
		return gateStatus;
	}

	public void setGateStatus(GateStatus gateStatus) {
		this.gateStatus = gateStatus;
	}

	public GateType getGateType() {
		return gateType;
	}

	public void setGateType(GateType gateType) {
		this.gateType = gateType;
	}

	public int getGateNo() {
		return gateNo;
	}

	public void setGateNo(int gateNo) {
		this.gateNo = gateNo;
	}
	
	
		
}
