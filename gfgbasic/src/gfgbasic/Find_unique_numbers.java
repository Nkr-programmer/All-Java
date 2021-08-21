package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Find_unique_numbers {
	 

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
			
			for(int i=0;i<n;i++)
			{
				
				a[i]=sc.nextInt();
			  
			
			}
		
		Arrays.sort(a);
				
			 for(int i=0;i<n;i=i+l)
			 {
				g=1;
					
				 for(int j=0;j<n;j++)
				 {
				 if(a[i]==a[j]) {g++;}
				 
				 }	 
		//g!=l
				 if(g==2) {System.out.print(a[i]);
					break;
					} 
				                  
				 
				 
			 }
				
			
			
			System.out.println(); 
			
			
			
			
		
			t--;
	 }
	 
	}
}
