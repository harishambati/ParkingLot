package models;

public class Payments extends BaseEntity {

	private int transId;
	
	private PaymentMode PaymentMode;
	
	private int amount;
	
	private BillStatus billSatus;

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public PaymentMode getPaymentMode() {
		return PaymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		PaymentMode = paymentMode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BillStatus getBillSatus() {
		return billSatus;
	}

	public void setBillSatus(BillStatus billSatus) {
		this.billSatus = billSatus;
	}
	
	
	
	
	
}
