package gfgmedium;

import java.util.Arrays;
import java.util.Scanner;

public class NearlySortedAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k=0,h=0,g=0,m;
				boolean x=false;
				
				n=sc.nextInt();
				m=sc.nextInt();
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					
						
						a[i]=sc.nextInt();
					  
	
				}
				
				  
				Arrays.sort(a);
				for(int i=0;i<n;i++)
				{
					
					
						
						System.out.print(a[i]+" ");
					  
	
				}
				
	
				
				System.out.println();
				
				t--;
		 }
		
		
		
		
	}

}
