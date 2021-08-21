package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Max_odd_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				l=sc.nextInt();
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			Arrays.sort(a);
				
			for(int i=n-1;i>=0;i--)
			{
			if(a[i]>0)	{
			g=g+a[i];
			h=i;
			}
			
			
			}
			System.out.print(g+" "+(h-1));
				
			
				t--;
		 }
	}

}
