package gfgbasic;

import java.util.Scanner;

public class Transform_to_prime {

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
					
					g=g+a[i];
				  
				
				}
				
//				
//				for(int i=1;i<=g;i++)
//				{
//					
//					if(g%i==0)
//					{
//						h++;
//						
//					}
//				  
//				
//				}
//				
//				if(h==2)
//				{
//					System.out.print("0");
//				}
				
				
				
				for(int j=0;j<=g;j++)
				{	h=0;	
					g=g+j;
				    for(int i=1;i<=g;i++)
				     {
					
					if(g%i==0)
					{
						h++;
						if(h>2)
						{
							break;
						}
						
					}
				  
					
				       }
				         if(h==2)
					      {
					     	System.out.print(j);
					     	break;
					       }
				
				g=g-j;
				}
				
				System.out.println();
				
			
				t--;
		 }
		
		
	}

}
