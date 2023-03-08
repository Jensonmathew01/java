/**
 * 
 */
package jenson;

/**
 * @author Administrator
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer c=new Customer(3452,"james","james@12");
	
		savingsAccount a=new savingsAccount(234,c,4500,1000);
		a.withdraw(3000);

	}

}
