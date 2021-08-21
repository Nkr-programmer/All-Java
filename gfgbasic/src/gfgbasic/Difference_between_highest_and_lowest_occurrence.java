package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Difference_between_highest_and_lowest_occurrence {

	public static void main(String[] args) {


		
		  int t;
		   
   	Scanner sc = new Scanner(System.in);
	    t = sc.nextInt();
	    
	 while(t>0){
			 
			int n,l,k=0,h=0,g=0;
			boolean x=false;
			
			n=sc.nextInt();
			int a[]=new int [n];
			int b[]=new int [n];
			for(int i=0;i<n;i++)
			{
				
				a[i]=sc.nextInt();
			  
			
			}
		
			Arrays.sort(a);
			for(int i=0;i<n;i++)
			{
			
				g=0;
				for(int j=0;j<n;j++)
				{
				if(a[i]==a[j])
				{
					g++;
					
					
				}
					
					
					
				}
				
				
				b[i]=g;
				
				
			}
			
			Arrays.sort(b);
			
	h=b[n-1]-b[0];
	    if(b[n-1]==b[0]) {
	    	System.out.print(b[0]);
	    }else {
		System.out.print(h);
	    }
		System.out.println();
			t--;
	 }
	
		
		
	}
	
}