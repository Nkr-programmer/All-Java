package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Find_second_largest_element {

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
				
				Arrays.sort(a);
				
								
				for(int i=0;i<n;i++)
				{
					
			if(a[n-1-i]!=a[n-2-i])
			{
				System.out.print(a[n-2-i]);
				x=true;
				break;
			}
			
					
				}
				
				if(x==false)
				{
					System.out.print("-1");
				}				
				
				
				System.out.println();
				
				
			
				t--;
		 }
		
		

		
		
		
		
		
	}

}
