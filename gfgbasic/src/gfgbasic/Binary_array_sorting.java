package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_array_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,g=0;
			
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				
				
				for(int i=0;i<n;i++)
				{
					
					if(a[i]==0)
						g++;
				  
				
				}
				for(int i=0;i<g;i++)
				{
					
						System.out.println("0 ");	
				}
				for(int i=0;i<n-g;i++)
				{
					
						System.out.println("1 ");	
				}
				System.out.println();
				
			
				t--;
		 }
	}

}
