package gfgbasic;

import java.util.Scanner;

public class Sherlock_the_dective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
			
				int a[]=new int [n+1];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<n+1;i++)
				{
					
					for(int j=0;j<n;j++)
					{
						if(i!=a[j]) {
							
						x=true;	
						}
						else {
							
							x=false;
							break;
						}
					}	
				  if(x==true)
				System.out.print(i+" ");
				}
		System.out.print(n);
		System.out.println();
		t--;
		}
		
	}

}
