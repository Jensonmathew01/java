package Bank;

public class savingsaccount extends Account implements maintenancecharge {
	

	public savingsaccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	public float calculateMaintenanceCharge(float noOfYear) {
		float charge;
		charge=(50*noOfYear)+50;
		
		return charge;

	}
	

}
