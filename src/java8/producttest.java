Java8 program to print list details having price greater than 10000.
********************************************************************	
package java8;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
public class producttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<product> s=new ArrayList<>();
        s.add(new product("laptop","123",30000));
        s.add(new product("phone","321",9000));
        s.add(new product("tab","1234",20000));
        List<String> products=s.stream().filter(t->t.getPrice()>10000).map(t->t.getPname()).collect(Collectors.toList());
        System.out.println("product is "+products);
        
        
	}

}
