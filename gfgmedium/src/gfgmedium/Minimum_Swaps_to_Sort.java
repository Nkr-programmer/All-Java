package gfgmedium;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Swaps_to_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		 int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k=0,h=0,g=0,m=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{	
						a[i]=sc.nextInt();
				}
				
				int z,y=0;
				int o= Integer.MAX_VALUE;
				for(int i=0;i<n;i++)
				{	
					 o= Integer.MAX_VALUE;
					for(int j=i;j<n;j++)
					{	
							if(a[j]<o)
							{
								
							o=a[j];
							y=j;
							}
							
					}
					if(a[i]!=o)
					{
						z=a[y];
						a[y]=a[i];
						a[i]=z;
						m++;
						
					}
				}
				
				
				
						System.out.print(m);
				
				
				
				System.out.println();
				
				t--;
		 }
		
		
		
		
		
	}

}
