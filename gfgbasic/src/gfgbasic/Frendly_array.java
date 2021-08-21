package gfgbasic;

import java.util.Scanner;

public class Frendly_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				  int h=Integer.MAX_VALUE;
				int n,l,k=0,g=0;
			
				int m=h;
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<n;i++)
				{
					  h=m;
					  g=0;
					
					for(int j=0;j<n;j++)
					{
						g=h;
						if(i!=j)  
						{
						if(a[i]>a[j]) 
						h=a[i]-a[j];
						  else
							  if(a[i]<a[j]) 
									h=a[j]-a[i];
						 
						}
						  if(h>g)
						  {
							  h=g;
						}
						
					}
					
					k=k+h;
					//System.out.println(g);
				}
				System.out.print(k+" ");
				System.out.println();
				
				
			
				t--;
		 }
		
		
		
		
	}

}
