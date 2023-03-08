package java8;
import java.util.*;
import java.util.stream.Collectors;
public class Employeelist {

	public static void main(String[] args) {
		List<Employee> e=new ArrayList<>();
		e.add(new Employee("Jenson","1",60000));
		e.add(new Employee("James","2",150000));
		e.add(new Employee("vicky","3",30000));
		List<Employee> updated=e.stream().filter(t->t.getSalary()<=200000).sorted(Comparator.comparing(Employee::getSalary).reversed())
		.peek(t->{ double salary=t.getSalary();
		           if(salary>100000) {
		        	   t.setSalary(salary*1.05);
		           }
		           else if(salary>50000) {
		        	   t.setSalary(salary*1.1);
		        	   
		           }
		           
		})
		.collect(Collectors.toList());
		//for(Employee a:updated)
			//System.out.println(a.getId()+" "+a.getName()+" "+a.getSalary());
		System.out.println(updated);
		
		

	}

}
