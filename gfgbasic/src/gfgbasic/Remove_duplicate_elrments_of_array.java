package gfgbasic;

import java.util.Scanner;

public class Remove_duplicate_elrments_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				
				
				n=sc.nextInt();
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				
				
				for(int i=0;i<n-1;i++)
				{
					if(a[i]!=a[i+1])
					{
						System.out.print(a[i]+" ");
						
					}
					
				}
				System.out.print(a[n-1]);
				System.out.println();
				
				
			
				t--;
		 }
		
		
		
		
	}

}
