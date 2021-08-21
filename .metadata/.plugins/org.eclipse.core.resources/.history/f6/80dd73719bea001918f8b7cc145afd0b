package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Minimize_the_sum_of_producct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  int t;
		   System.out.println(5/2);
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
				for(int i=0;i<n;i++)
				{
					
					b[i]=sc.nextInt();
				  
				
				}
			Arrays.sort(a);
			Arrays.sort(b);
				for(int i=0;i<(n/2);i++)
				{
					k=b[i];
					b[i]=b[n-1-i];
					b[n-1-i]=k;				
				}
				
				
				
				
				
				
				
				for(int i=0;i<n;i++)
				{
					
					h=h+a[i]*b[i];
					
				}
				
				
				
				System.out.print(h);
				System.out.println();
			
				t--;
		 }
		
		
		
	}

}
