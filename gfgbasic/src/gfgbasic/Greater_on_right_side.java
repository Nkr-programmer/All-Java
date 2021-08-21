package gfgbasic;

import java.util.Scanner;

public class Greater_on_right_side {

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
			
				for(int i=0;i<n-1;i++)
				{
					
					for(int j=i+1;j<n;j++)
					{
						if(a[i]>l)
						{
							
							l=a[i];
							
						}
					  
					
					}
				 
				System.out.print(l+" ");
				l=Integer.MIN_VALUE;
				}	
				
				a[n-1]=-1;
				
				
				System.out.print(a[n-1]);
				System.out.println();
			
				t--;
		 }
		
		
		
		
		
		
	}

}
