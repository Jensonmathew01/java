package Bank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class test {
	

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		Account a=new Account(null,null,0);
		savingsaccount s=new savingsaccount(null,null,0);
		currentaccount c=new currentaccount(null,null,0);
		Scanner in=new Scanner(System.in);
		System.out.println("1.savings account");
		System.out.println("2.current account");
		System.out.println("Enter your choice ");
		int num;
		num=in.nextInt();
		switch(num)
		{
		case 1:System.out.println("Enter the account number");
		       a.setAccountNumber(in.next());
		       System.out.println("Enter the customer name");
		       a.setCustomerName(br.readLine());
		       System.out.println("Enter the balance amount");
		       a.setBalance(in.nextInt());
		       System.out.println("Enter no. of years ");
		       float noOfYear=in.nextFloat();
		       System.out.println("Customer name "+a.getCustomerName());
		       System.out.println("Account no "+a.getAccountNumber());
		       System.out.println("Balance amount "+a.getBalance());
		       float result=s.calculateMaintenanceCharge(noOfYear);
		       System.out.println("Maintenance charge "+result);
		       break;
		       
		case 2:  System.out.println("Enter the account number");
	             a.setAccountNumber(in.next());
	             System.out.println("Enter the customer name");
	             a.setCustomerName(br.readLine());
	             System.out.println("Enter the balance amount");
	             a.setBalance(in.nextInt());
	             System.out.println("Enter no. of years ");
	             float noofYear=in.nextFloat();
	             System.out.println("Customer name "+a.getCustomerName());
	             System.out.println("Account no "+a.getAccountNumber());
	             System.out.println("Balance amount "+a.getBalance());
	             double result1=s.calculateMaintenanceCharge(noofYear);
	             System.out.println("Maintenance charge "+result1);
	             break;
	     default: System.out.println("invalid input");        
		    
		       
		}

	}

}
