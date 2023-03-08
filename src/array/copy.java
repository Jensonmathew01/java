package array;

import java.util.Arrays;

public class copy
{
		public static void main(String args[])
		{
			int a[]= {4,-4,6,8,-9,0,-7,56};
			int b[]=new int[8];
			int c[]=new int[8];
			int d[]=new int[8];
			int e[]=new int[8];
			int pcount=0,ncount=0;
			int i,j;
			for(i=0;i<8;i++)
			{
				if(a[i]>0)
				{
					pcount=a[i];
					b[i]=pcount;
				}
				
			  }	
				for(j=0;j<8;j++)
				{
			     if(a[j]<0)
			      {
					ncount=a[j];
				   c[j]=ncount;
			      }
			     
				}
				int k=0,l=0;
				for(i=0;i<b.length;i++)
					if(b[i]>0)
						d[k++]=b[i];
				for(i=0;i<c.length;i++)
					if(c[i]<0)
						e[l++]=c[i];
			   d=Arrays.copyOf(d, 4);
			   e=Arrays.copyOf(e, 3);
			
		
			System.out.println("positive array is ");
			for(i=0;i<d.length;i++)
				System.out.print(d[i]+" ");
			System.out.println();
				
			System.out.println("negative array is");
				for(i=0;i<e.length;i++)
					 System.out.print(e[i]+" ");	
		}

	}
