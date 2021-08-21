package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;
//barbadddd
public class K_largest_numbers {

	public static void main(String[] args) {
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=Integer.MIN_VALUE;
				boolean x=false;
				
				n=sc.nextInt();
				
				l=sc.nextInt();
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				Arrays.sort(a);
				
				for(int i=n-1;i>=n-l;i--)
				{
				System.out.println(a[i]);
				}
			
				
				System.out.println();
				t--;
		 }
		
		
	}

}
