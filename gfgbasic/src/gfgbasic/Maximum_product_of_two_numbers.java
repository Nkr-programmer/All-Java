package gfgbasic;

import java.util.Scanner;

public class Maximum_product_of_two_numbers {

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
				
				for(int i=0;i<n;i++)
				{
					{
					for(int j=0;j<n;j++)
					{
						
					         	if(i!=j) {
				             	  k=a[i]*a[j];
				             	  
				                  		}
					         	
					                              if(h<k)
					                              {
						                           h=k;
					                                 }
					         	
					}
					
					}
				
				}
				
				
				//Arrays.sort(a);
				
			//	for(int i=0;i<n;i++)
			//	{
					
			//		h=a[n-1]*a[n-2];
				  
				
			//	}
			
				System.out.print(h);
				
				System.out.println();
				
				
			
				t--;
		 }
		
		
		
		
		
		
		
	}

}
