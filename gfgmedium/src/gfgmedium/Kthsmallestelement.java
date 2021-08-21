package gfgmedium;

import java.util.Arrays;
import java.util.Scanner;

public class Kthsmallestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k=0,h=0,g=0,m;
				boolean x=false;
				
				n=sc.nextInt();
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					
						
						a[i]=sc.nextInt();
					  
	
				}
				m=sc.nextInt();
				  
				Arrays.sort(a);
				System.out.print(a[m-1]);
	
				
				System.out.println();
				
				t--;
		 }
		
		
		
		
		
		
	}

}
