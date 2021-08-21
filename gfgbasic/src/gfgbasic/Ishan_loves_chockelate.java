package gfgbasic;

import java.util.Scanner;

public class Ishan_loves_chockelate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				l=Integer.MAX_VALUE;
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<n-1;i++)
				{
					
					
						if(a[i]<l)
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
