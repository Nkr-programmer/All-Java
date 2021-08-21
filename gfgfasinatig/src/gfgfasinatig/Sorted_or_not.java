package gfgfasinatig;

import java.util.Scanner;

public class Sorted_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n;
				
				boolean x=true;
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
		
				
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
					
				}
		
				for(int i=0;i<n-1;i++)	
				    {
				if(a[i]>a[i+1])
			{
					x=false;
					break;
			}
			else
			{
					
					x= true;
			}
				
				
				    }
				System.out.println(x);
		
				t--;
		 }
		
		
	}

}
