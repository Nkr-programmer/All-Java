package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_didtinct_elements_of_limited_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				l=Integer.MIN_VALUE;
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				Arrays.sort(a);
				
				for(int i=0;i<n;i++)
				{
				
					if(l<a[i])
					{
						l=a[i];
					 
					k=k+l;	
					}
				}
			
				
				System.out.print(k);
				System.out.println();
				
				t--;
		 }
		
		
		
		
	}

}
