package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Form_a_Triangle {

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
		for(int i=0;i<n;i++)
		{
			
			
			for(int j=i;j<n-1;j++)
			{
				
				g=a[i]+a[j+1];
				
				for(int y=0;y<n;y++)
				{
					
					if((g>a[y])&&(y!=i)&&(y!=j+1)&&(a[i]<=a[y])&&(a[j+1]<=a[y]))
					{
						
						k++;
						
					}
					
				}
			
			}
		  
		
		}
				
				
				System.out.print(k);
				
				System.out.println();
				
			
				t--;
		 }
				
				
						
		
		
		
	}

}
