package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Kings_war {

	
	
	public static void main(String[] args) {
	
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
			if(a[i]==a[0])
			g++;
		  
		
			if(a[i]==a[n-1])
			{
				k++;
			}
		}
			h=g+k;
			int m=n-h;
			
			if(m==0)
			{System.out.print("0");}
			else {
				System.out.print(m);
			}
		  System.out.println();
			t--;
	 }
	 }
	
}
