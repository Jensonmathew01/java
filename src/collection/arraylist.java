Program to implement arraylist operations.
******************************************	
package collection;
import java.util.*; 

public class arraylist {   
	public static void main(String args[]){ 
	Scanner in=new Scanner(System.in);	
	int num,i;
	ArrayList<String> list=new ArrayList<String>(5);//Creating arraylist
	System.out.println("Enter size");
	num=in.nextInt();
	System.out.println("Enter Elements");
	for(i=0;i<num;i++)
	{
		list.add(in.next());
	}
	 list.add("james");
	 
	//Traversing list through Iterator  
	System.out.println(list); 
	list.remove(2);
    list.sort(null);
	System.out.println(list);
	for(i=0;i<num;i++)
	{
		System.out.println(list.get(i) +" ");;
	}

  
	}  
	} 
	 
	




