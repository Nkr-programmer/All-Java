package gfgbasic;

import java.util.Scanner;

public class First_element_to_occur_k_times {

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
			
				
						
				
				for(int i=0;i<n;i++)
				{
				g=0;	
					for(int j=0;j<n;j++)
					{
						if(a[i]==a[j])
						{
							g++;
							
						}
					  
					
					}
				  
				if(g==l)
				{x=true;
					System.out.print(a[i]);
					break;
				}
				else
				{
				    x=false;
				}
				}
				if(x==false)
				{
				   	System.out.print("-1"); 
				    
				}
				
				
				System.out.println();
				
			
				t--;
		 }
				
				
						
		
		
		
		
	}

}
