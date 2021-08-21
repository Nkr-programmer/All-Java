package gfgbasic;

import java.util.Scanner;

public class Average_cound_array {

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
				int b[]=new int [n];
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				
				for(int i=0;i<n;i++)
				{
					g=0;
					h=(a[i]+l)/2;
					for(int j=0;j<n;j++)
					{
						if(h==a[j])
						{
							g++;
						}
					}
				
				b[i]=g;
				}
				
				
				
				
				for(int i=0;i<n;i++)
				{
				System.out.print(b[i]+" ");
				
				}
				
				System.out.println();
			
				t--;
		 }
		
		
		
		
		
		
		
		
		
		

	}

}
