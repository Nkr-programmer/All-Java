package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Professor_and_Parties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
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
				
				for(int i=0;i<n-1;i++)
				{
					
					if(a[i]==a[i+1])
					{
						System.out.print("BOYS");
						x=true;
						break;
					}
				
				}
				if(x==false)
				{
					System.out.print("GIRLS");
				}
				
				System.out.println();
				
			
				t--;
		 }
		
		
		
		
		
		
		
		
		
		
	}

}
