package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Even_occurring_elements {

	public static void main(String[] args) {
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
			Arrays.sort(a);
				for(int i=0;i<n;i=i+g)
				{
					g=0;
					for(int j=i;j<n;j++)
					{
						
						if(a[i]==a[j])
						{
							g++;
							
						}
						
					
					}
				  
				if(g%2==0)
				{
					System.out.print(a[i]);
				  x=true;
				}
				else
				{
			
				}
					
				}
				
				if(x!=true)
				{
					System.out.println();
				}
					
			
				System.out.println();
				
			
				
				
				
				
				
				
				
				
				
				
			
				t--;
		 }
		
}

}
