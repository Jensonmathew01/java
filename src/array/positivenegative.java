package array;

public class positivenegative {
	public static void main(String args[])
	{
	    int a[]= {4,-4,6,8,-9,0,-7,56};
		int pcount=0,ncount=0,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0)
				pcount++;
			else if(a[i]<0)
				ncount++;
			
		}
		System.out.println("No of positive numbers: "+pcount);
		System.out.println("No of negative numbers: "+ncount);
		
	}

}
