package java8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Testing {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str,sn,sid,more;
		System.out.println("Enter your name ");
		sn=in.nextLine();
		System.out.println("Enter your id");
		sid=in.nextLine();
		List<List<String>> tt=new ArrayList<>();
		List<Food> f=new ArrayList<>();
		f.add(new Food("veg meal",80));
		f.add(new Food("fish curry",120));
		f.add(new Food("chappati veg",40));
		f.add(new Food("chappati chicken",120));
		f.add(new Food("veg friedrice",60));
		f.add(new Food("chicken friedrice",80));
		//System.out.println(f);
		System.out.println("Enter your food order(veg meal,fish curry,chappati veg,chappati chicken,veg friedrice,chicken friedrice) ");
		str=in.nextLine();
		List<Food> food1=f.stream().filter(t->t.getFname().equals(str)).collect(Collectors.toList());
		System.out.println("Congratulations "+sn+" your order is booked.");
		tt.addAll((Collection<? extends List<String>>) food1);
		System.out.println(tt);
		System.out.println("Do you want to add anything more(yes or no)");
		more=in.nextLine();
		more=more.toLowerCase();
		while(true)
		{
		if(more.equals("yes"))
		{
			String str1;
			System.out.println("Enter your food order (veg meal,fish curry,chappati veg,chappati chicken,veg friedrice,chicken friedrice) ");
			str1=in.nextLine();
			List<Food> food2=f.stream().filter(t->t.getFname().equals(str1)).collect(Collectors.toList());
			System.out.println("Congratulations "+sn+" your order is booked.");
			tt.addAll((Collection<? extends List<String>>) food2);
			System.out.println(tt);
			System.out.println("Do you want to add anything more(yes or no)");
			more=in.nextLine();
		}
		else
		{
	      break;
		}
	
	  }
		while(true)
		{
			String del;
			int str2;
			System.out.println("Do You want to delete any order(Yes or no) ");
			del=in.next();
			del=del.toLowerCase();
			if(del.equals("yes"))
			{
				
				System.out.println("Which order is to be deleted(order number)");
				str2=in.nextInt();
				System.out.println("Your order is ");
				tt.remove(str2-1);
				System.out.println(tt);
				
			}
			else
			{
			    System.out.println("Ok Visit Again");
			    System.out.println("Your final order is ");
			    System.out.println(tt);
			    break;

			}
		}
		
		
	}

}
