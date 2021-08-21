package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_in_specific_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0,m=0;
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
					if((a[i]%2)!=0)
					{
						
						b[g]=a[i];
						
						
						g++;
					}
					
				}
				
				
				
				
				
				h=g;
				int c[]=new int [h];
				for(int i=0;i<n;i++)
				{
					if((a[i]%2)==0)
					{
						
						b[g]=a[i];
						
						
						g++;
					}
					
				}
				
				
				
				
				int d[]=new int [g-h];
				for(int i=0;i<n;i++)
				{
				if(i<h) {
					c[i]=b[i];
			
				}
				else
				{
					d[m]=b[i];
					
					m++;
					
				}
					
			
				}
			
				
					
				
				
				Arrays.sort(c);
				Arrays.sort(d);
				for(int i=0;i<(c.length/2);i++)
				{
					k=c[i];
					c[i]=c[c.length-1-i];
					c[c.length-1-i]=k;				
				}
				
			
				
				for(int i=0;i<c.length;i++) {
					System.out.print(c[i]+" ");
					
				}
				for(int i=0;i<d.length;i++) {
					System.out.print(d[i]+" ");
					
				}
				
			System.out.println();
				t--;
		 }
		
		
		
		
	}

}
