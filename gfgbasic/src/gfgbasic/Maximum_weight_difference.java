package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_weight_difference {

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
				for(int i=0;i<n;i++)
				{
					if(l<=n/2) {
					if(i<l)
					{
						g=g+a[i];
					}
					else {
						
						k=k+a[i];
					}
					}
					
					else
					{
						
						if(i<(n-l))
						{
							g=g+a[i];
						}
						else {
							
							k=k+a[i];
						}
						
					}
					
					
				}
				
		
		h=k-g;
		
		
		
		System.out.print(h);
		System.out.println();
		
		
		t--;
		 }
		
		
	}

}
