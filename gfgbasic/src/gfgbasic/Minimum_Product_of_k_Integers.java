package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Product_of_k_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 long k=1;
				int n,l,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				l=sc.nextInt();
				
				Arrays.sort(a);
				for(int i=0;i<l;i++)
				{
					
					k=k*a[i];
				  
				k=k%1000000007;
				}
				
				System.out.print(k);
				System.out.println();
			
				t--;
		 }

	}

}
