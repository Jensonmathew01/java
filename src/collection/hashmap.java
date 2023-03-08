package collection;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		int a,k;
		map.put("jenson", 1);
		map.put("james",2);
		map.put("simon", 3);
		System.out.println("map is "+map);
		map.remove("james");
		System.out.println("map is "+map.keySet());
		a=map.get("jenson");
		System.out.println("Jenson is "+a);
		int hashcode="simon".hashCode();
		System.out.println("hashcode is "+hashcode);
		boolean b=map.containsKey("simn");
		System.out.println(b);
		for(String name: map.keySet())
		{
			int value=map.get(name);
			System.out.println(name+" "+value);
		}
			
		
	}

}
