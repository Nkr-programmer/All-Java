package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_and_maximize {

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
				
				for(int i=0;i<n-1;i+=2)
				{
			
					k=a[n-1];
					
					for(int j=0;j<n-i-1;j++)
					{
					a[n-j-1]=a[n-j-2];
					
					
					}
					a[i]=k;
					
					
				}
				
				
				for(int i=0;i<n-1;i++)
				{
					if(i%2==0) {
					g=g+a[i]-a[i+1];
					            }
					else {
						g=g+a[i+1]-a[i];
				         }
				}
				g=g+a[0]-a[n-1];
		    	System.out.print(g);
				System.out.println();
			
				t--;
		 }
		
		
		
		
		
		
		
	}

}
