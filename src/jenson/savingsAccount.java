package jenson;

public class savingsAccount extends Account {

	     private double minimumbalance;
	     
	     
		public savingsAccount(int accountNumber, Customer customerObj, double balance, double minimumbalance) {
			super(accountNumber, customerObj, balance);
			this.minimumbalance = minimumbalance;
		}

		public double getMinimumbalance() {
			return minimumbalance;
		}

		public void setMinimumbalance(double minimumbalance) {
			this.minimumbalance = minimumbalance;
		}


		public boolean withdraw(double amount) {
			if((balance-amount)>minimumbalance)
			{
				balance=balance-amount;
				System.out.println("True balance is "+balance);
				return true;
			}
			else
			{
				System.out.println("False");
				return false;
			
		}
		}

		

		
		

		

	}



