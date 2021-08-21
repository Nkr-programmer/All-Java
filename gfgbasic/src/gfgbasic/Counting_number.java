package gfgbasic;

import java.util.Scanner;

public class Counting_number {

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
				l=sc.nextInt();
				
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
						
					{
						if(a[i]!=0)
						{
							
							h=a[i]%10;
							a[i]=a[i]/10;
							
							if((h==l)) 
							{
								
								g++;
							}
							
							
						}
						
						
						
					}	
					
				
				}
				
				
				System.out.println(g);
			
				
		
		t--;
		 }
		
	}

}
