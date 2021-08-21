package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Find_min_and_max_elements_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				l=Integer.MIN_VALUE;
				h=Integer.MAX_VALUE;
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				Arrays.sort(a);
				
				System.out.print(a[0]+" "+a[n-1]);
				System.out.println();
				
			
				t--;
		 }
		
		
		
		
	}

}
