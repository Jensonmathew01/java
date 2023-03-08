package java8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
public class Hotellist {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the budget ");
		int budget,hid;
		String cname,cid,cemail;
		budget=in.nextInt();
		List<Hotel> h=new ArrayList<>();
		h.add(new Hotel(1,5000,"Ashwathi"));
		h.add(new Hotel(2,7000,"Plaza"));
		h.add(new Hotel(3,10000,"crown"));
		if(budget<5000)
			System.out.println("no hotels available");
		else {
		List<Hotel> hotel=h.stream().filter(t->t.getRent()<=budget).collect(Collectors.toList());
		System.out.println(hotel);
	    System.out.println("Enter the hotel id you want");
	    hid=in.nextInt();
	    List<Hotel> select=hotel.stream().filter(t->t.getId()==hid).collect(Collectors.toList());
        System.out.println(select);
        System.out.println("For registration");
        System.out.println("Enter your name");
        cname=br.readLine();
        System.out.println("Enter your ID");
        cid=in.next();
        System.out.println("Enter your email Id");
        cemail=in.next();
        //List<Hotel> t1=select.stream().filter(t->t.getId()==hid).collect(Collectors.toList());
        System.out.println("Successful");
        System.out.println("Hello "+cname+" your id is "+cid+" your email id is "+cemail+" has booked for the hotel"+select);
		}
        		
	}

}