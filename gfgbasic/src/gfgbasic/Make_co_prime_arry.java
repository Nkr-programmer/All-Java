package gfgbasic;

import java.util.Scanner;

public class Make_co_prime_arry {

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
			
//				for(int i=0;i<n-1;i++)
//				{
//				   if((a[i]/a[i+1]==0)||(a[i+1]/a[i]==0))
//				   {
//					   for(int j=a[i];j<a[i+1];j++)
//						{
//						   if((a[i]/j!=0)||(a[i+1]/j!=0)) {
//							   
//							   g++;
//						   }
//						   
//						}
//					   
//				   }
//					
//					
//					
//				}
				for(int i=0;i<n-1;i++)
				{
				   if(((a[i]%a[i+1])==0)||(a[i+1]%a[i]==0))
				   {
					  
					   g++;
				   }
				}
				System.out.print(g);
				System.out.println();
				
				
			
				t--;
		 }
		
		
		
		
	}

}
