package gfgbasic;

import java.util.Scanner;

public class Count_pair_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				k=sc.nextInt();
				
				int a[]=new int [n];
				int b[]=new int [k];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
				for(int i=0;i<k;i++)
				{
					
					b[i]=sc.nextInt();
				  
				
				}
				
				l=sc.nextInt();
			
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<k;j++)
					{
					g=a[i]+b[j];
					
					if(g==l) {
						h++;
						
					         }
					
					}
					
					
				}
				
				System.out.print(h);
				System.out.println();
			
				t--;
		 }
		
		
	}

}
