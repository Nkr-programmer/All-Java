package gfgfasinatig;

import java.util.Scanner;

public class Max_Min_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				l=Integer.MIN_VALUE;
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<n;i++)
				{
					if(l<a[i])
					{
						l=a[i];
					}
				}
				
				System.out.print(l+" ");
				l=Integer.MAX_VALUE;
				for(int i=0;i<n;i++)
				{
					if(l>a[i])
					{
						l=a[i];
						
					}
				  
				
				}
				System.out.print(l);
				
				
				
				System.out.println();
			
				t--;
		 }
		
		
		
		
	}

}
