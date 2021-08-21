package gfgbasic;

import java.util.Scanner;

public class Or_new_array {

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
				int b[]=new int [n];
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<n;i++)
				{
					if(i<n-1) {
				b[i]=a[i]|a[i+1];
					}
					
					else
					{
					b[i]=a[i];	
					}
				
				}
				
				
				for(int i=0;i<n;i++)
				{
					
				System.out.print(b[i]+" ");
				  
				
				}
				System.out.println();
				
				
				
				
			
				t--;
		 }
		
		
		
		
	}

}
