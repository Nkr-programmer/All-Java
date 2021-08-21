package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Third_largest_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				Arrays.sort(a);
				
				if(n<3)
				{
					System.out.print("-1");
				}
				else
				{
					System.out.print(a[2]);
					
				}
				
			
				t--;
		 }
		
		
		
		
	}

}
