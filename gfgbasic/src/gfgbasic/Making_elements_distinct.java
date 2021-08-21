package gfgbasic;

import java.util.Scanner;

public class Making_elements_distinct {

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
			
				
					

						for(int i=0;i<n-1;i++)
						{
						for(int j=i;j<n-1;j++)
						{
						    	if(a[i]==a[j+1])
							{
								a[j+1]++;
							}
					
					}	
						}
						
				for(int j=0;j<n;j++)
				{
					g=g+a[j];
					
				}
				
				System.out.print(g);
				System.out.println();
			
				t--;
		
		 
		 }
	}
}


