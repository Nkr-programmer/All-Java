package gfgbasic;

import java.util.Scanner;

public class Balance_array {

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
					if(i<n/2)
					{
				
					k=k+a[i];
					}
					else 
					{
						g=g+a[i];
					}
					
					
				  
				
				}
				
				h=g-k;
				if(h<0)
				{
					h=-h;			
				}
				System.out.print(h);
				System.out.println();
			
				t--;
		 
		 }
		
		
		
	}

}
