package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Ceil_The_Floor {

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
				
				
				for(int i=0;i<n;i++)
				{
					
						
					if((a[i]==l)&&(i!=n-1)&&(i!=0)) {
							
							
							
							System.out.print(a[i]);
							System.out.println();
							System.out.print(a[i+1]);
							
							break;
							
						}else
							if((a[i]>l)&&(l>a[0])&&l<a[n-1]) 
						{
							System.out.print(a[i-1]);
							System.out.println();
							System.out.print(a[i]);
							break;
							
						}
								  
				
				}
				
				
				if(l<a[0])
				{
					System.out.print("Floor doesn't exist");
					System.out.println();
					System.out.print(a[0]);
					
					
				}
				else
					if(l>a[n-1])
					{
						System.out.print(a[n-1]);
						System.out.println();
						System.out.print("Ceil doesn't exist.");
						
					}		  
		
		
				System.out.println();
				
			
				t--;
		 }
		
		
		
		
		
		
	}

}
