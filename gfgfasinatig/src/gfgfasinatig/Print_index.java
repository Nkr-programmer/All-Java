package gfgfasinatig;

import java.util.Scanner;

public class Print_index {

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
			
				
					System.out.print(a[l]);
				  
				
				
				
				System.out.println();
				
				
			
				t--;
		 }
		
		
	}

}
