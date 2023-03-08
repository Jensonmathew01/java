package Bank;

public class currentaccount extends Account implements maintenancecharge {
	
	public currentaccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	public float calculateMaintenanceCharge(float noOfYear) {
		float charge;
		charge=(100*noOfYear)+200;
		System.out.println("Maintenance charge is "+charge);
		return charge;
	}

}
