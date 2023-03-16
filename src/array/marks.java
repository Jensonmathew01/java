Program to print total marklist of the Students.
************************************************	
package array;

public class marks {

	public static void main(String[] args) {
	String s[]= {"Alice","Bob","Charlie","David","Eva"};
	int m[][]= {{80,75,90},{85,70,95},{90,80,85},{75,85,90},{95,90,80}};
    int total=0;
    int i,j,temp;
    int a[]=new int[5];
    for(i=0;i<5;i++)
    {
    	for(j=0;j<3;j++)
    	{
    		
    		total=total+m[i][j];
    		a[i]=total;
    	}
    	total=0;
    }
    System.out.println("Total marklist is");
    for(i=0;i<5;i++)
    {
   	System.out.print(s[i]+" ");
       System.out.println(a[i]);
   }
    for(i=0;i<5;i++)
    {
    	for(j=i+1;j<5;j++)
    	{
    		if(a[i]<a[j])
    		{
    		temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		}
    	}
    }

}
	
}

