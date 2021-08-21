package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Check_if_two_arrays_are_equal {

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
				for(int i=0;i<n;i++)
				{
					
					b[i]=sc.nextInt();
				  
				
				}
			
				Arrays.sort(a);
				Arrays.sort(b);
				
				for(int i=0;i<n;i++)
				{
					
					if(a[i]==b[i])
					{
						x=true;
					}
					else
					{
						x=false;
						break;
					}
					
				}
				
				
				System.out.print(x);
			System.out.println();
				t--;
		 }

		
		
		
		
		
		
	}

}
