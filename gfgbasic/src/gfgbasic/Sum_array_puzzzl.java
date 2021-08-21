package gfgbasic;

import java.util.Scanner;

public class Sum_array_puzzzl {

	public static void main(String[] args) {
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				int b[]=new int [n];
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<n;i++)
				{
					
					for(int j=0;j<n;j++)
					{
						
						if(i!=j)
						{h=h+a[j];}
					  
					
					}
				b[i]=h;  
				h=0;
				}
				
				
				for(int i=0;i<n;i++)
				{
				System.out.print (b[i]);
				}
			System.out.println();
				
				
				t--;
		 }
		
		
		
		
		
	}

}
