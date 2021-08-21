package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_in_the_array {

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
				
		

		int a1=0,b1=1,c1,d1,e1,n1;

		
		
		
		int z[]=new int [a[n-1]+2];
		z[0]=a1;
		z[1]=b1;
		for(int i=2;i<a[n-1]+2;i=i=i+2)
		{
			if(b1<a[n-1]) {
			c1=a1+b1;
			d1=b1+c1;
			a1=c1;
			b1=d1;
			if((c1>0)&&(d1>0)) {
			z[i]=c1;
			z[i+1]=d1;
			}
			}
			

		}
		
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<a[n-1]+2;j++)
			{
				if((z[j]==a[i])&&(z[j]>0))
				{
					h++;
					break;
				}
				
			}
			
			
		}
		
		for(int j=0;j<n;j++)
		{
			if(a[j]==0)
			{
				h++;
				break;
			}
		}
		
		
		System.out.print(h);
		
			System.out.println();
				
		t--;
		 }
		
		
		
		
		
		
		
		
	}

}
