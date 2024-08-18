package models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseEntity{
	
	private Date enrtrytime;
	
	private Date exitTime;
	
	private Ticket ticket;
	
	private double fees;
	
	private List<Payments> payments;
	
	private BillStatus billStatus;

	public Date getEnrtrytime() {
		return enrtrytime;
	}

	public void setEnrtrytime(Date enrtrytime) {
		this.enrtrytime = enrtrytime;
	}

	public Date getExitTime() {
		return exitTime;
	}

	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public List<Payments> getPayments() {
		return payments;
	}

	public void setPayments(List<Payments> payments) {
		this.payments = payments;
	}

	public BillStatus getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(BillStatus billStatus) {
		this.billStatus = billStatus;
	}
	
	
	
}
