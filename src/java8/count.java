package java8;
import java.util.*;
import java.util.stream.Collectors;
public class count {

	public static void main(String[] args) {
		
         Scanner in=new Scanner(System.in);
         String s;
         int i;
         System.out.println("Enter student article");
         s=in.nextLine();
         String st=s.replaceAll("[,:;.!?]", "");
         List<String> mylist=new ArrayList<>(Arrays.asList(st.split(" ")));
         System.out.println(mylist);
         System.out.println("No of words is "+mylist.size());
         List<String> out=mylist.stream().map(t->t.toLowerCase()).distinct().sorted().collect(Collectors.toList());
         System.out.println("unique word count "+out.size());
         System.out.println("words are ");
         for(i=0;i<out.size();i++)
        	 System.out.println(out.get(i));
        
	}

}
