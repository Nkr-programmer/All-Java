package gfgbasic;

import java.util.Scanner;

public class Number_of_occurence {

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
				
				if(l==a[i])
				{
					g++;
				}
				
					
					
			            	}
				
				
				if(g==0)
				{
					g=-1;
				}
				
				System.out.println(g);
				System.out.println();
			
				
		 
				t--;
		 
		 }
		
		
		
	}

}
