Program to perform hashmap operation.
*************************************	
package collection;
import java.util.*;
public class multiplehashmap {
   String name;
   int age;
   String department;
   public multiplehashmap(String name, int age, String department) {
	super();
	this.name = name;
	this.age = age;
	this.department = department;	
}
   public static void main(String args[])
   {
	   HashMap<Integer,multiplehashmap> map=new HashMap<Integer,multiplehashmap>();
	   multiplehashmap obj1=new multiplehashmap("jenson",22,"computer");
	   multiplehashmap obj2=new multiplehashmap("james",23,"electronics");
	   map.put(1,obj1);
	   map.put(2, obj2);
	   for(Map.Entry<Integer,multiplehashmap> m:map.entrySet())
	   {
		   Integer key=m.getKey();
		   multiplehashmap obj=m.getValue();
		   System.out.println(key +" "+ obj.age+" "+obj.name+" "+obj.department);
		   
	   }
	   int hash=obj1.hashCode();
	   System.out.println("hashcode is "+hash);
	 
	   
   }  
	   
   }
   
