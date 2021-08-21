package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Java_1d_and_2d_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				
				int a[][]=new int [n][n];
				int b[]=new int [n];
				for(int i=0;i<n;i++)
				{
					
					for(int j=0;j<n;j++)
					{
						
						a[i][j]=sc.nextInt();
					  
					
					}
				  
				
				}
			
				
				for(int j=0;j<n;j++)
				{
					
					b[j]=sc.nextInt();
				  
				
				}
				
				
				for(int i=0;i<n;i++)
				{
					
					for(int j=0;j<n;j++)
					{
						
						if(i==j)
						{
							g=g+a[i][j];
							
						}
					  
					
					}
				  
				
				}
				
				Arrays.sort(b);
				h=b[n-1];
			System.out.print(g+" "+h);
			System.out.println();
				t--;
		 }
		
		
		
		
		
		
	}

}
