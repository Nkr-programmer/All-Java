package gfgfasinatig;

import java.util.Scanner;

public class Reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
				
				
				for(int j=n-1;j>=0;j--)
				{
					
					System.out.print(a[j]+" ");
				}
				
		
				System.out.println();
				
				
				t--;
		 }
		 
		 
		 
	}

}
