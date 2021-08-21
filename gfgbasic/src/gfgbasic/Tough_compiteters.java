package gfgbasic;

import java.util.Scanner;

public class Tough_compiteters {

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
			
				for(int i=0;i<n;i++)
				{
				
					
					for(int j=0;j<n;j++)
					{
						   
						h=g;
						
						if((a[i]>=a[j])&&(i!=j)) {	
						g=a[i]-a[j];
						}
						else
							if((a[i]<=a[j])&&(i!=j)) 
						{
							g=a[j]-a[i];
						}
						
						
						if(h<g)
						{
							g=h;
						}
						
						
					}
					
					
					
				}
				System.out.print(g+" "+h);
				System.out.println();
				
				
			
				t--;
		 }
		
		
		
		
	}

}
