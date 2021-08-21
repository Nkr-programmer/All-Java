package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Product_of_max_in_first_array_min_in_sec_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				int b[]=new int [n];
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
				g=sc.nextInt();
				for(int i=0;i<g;i++)
				{
					
					b[i]=sc.nextInt();
				  
				
				}
			
				Arrays.sort(a);
				Arrays.sort(b);
				
				g=a[n-1]*b[0];
				
				
				System.out.print(g);
			System.out.println();
				t--;
		 }
		
		
		
		
		
		
	}

}
