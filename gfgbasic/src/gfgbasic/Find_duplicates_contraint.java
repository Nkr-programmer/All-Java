package gfgbasic;

import java.util.Scanner;

public class Find_duplicates_contraint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				  int g=Integer.MAX_VALUE;
				int n,l,k=0,h=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<n-1;i++)
				{
				
					
					if(a[i]==a[i+1])
				{
					
					System.out.println(a[i]);
					break;
				}
				
						   
						
				
				}
				
				System.out.println();
				
				
			
				t--;
		 }
		
		
		
		
		
		
	}

}
