package java8;
import java.util.*;
import java.util.stream.Collectors;
public class Cutomerlist {

	public static void main(String[] args) {

	    int i;
		List<Customer> a=new ArrayList<>();
		a.add(new Customer(1,"Jenson","1234567890","jenson12@gmail.com","Thiruvalla"));
		a.add(new Customer(2,"Anirudh","2134567890","funda@gmail.com","Ernakulam"));
		a.add(new Customer(3,"Christo","2234567890","christho@gmail.com","Kottayam"));
		a.add(new Customer(4,"Blesson","3334567890","blasson@gmail.com","Trivandrum"));
		Scanner in=new Scanner(System.in);
		System.out.println("Enter registerid ");
		i=in.nextInt();
        List<Customer> newcustomer=a.stream().filter(t->t.getRegisterid()==i).collect(Collectors.toList());
        System.out.println(newcustomer);
	}

}
