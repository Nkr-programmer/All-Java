package gfgmedium;

import java.util.Arrays;
import java.util.Scanner;

public class Convert_an_array_to_reduced_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k=0,h=0,g=0,m;
				boolean x=false;
				
				n=sc.nextInt();
				
				int a[]=new int [n];
				int b[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					
						
						a[i]=sc.nextInt();
						b[i]=a[i];
	
				}
				
				  
				Arrays.sort(b);
				
				
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{	
					if(b[i]==a[j])
					{
						a[j]=i;
					
					}
						
					
				}
				}
	
				
				for(int j=0;j<n;j++)
				{	
				System.out.print(a[j]+" ");
				}
				System.out.println();
				
				t--;
		 }
		
		
		
		
		
		
		
		
		
		
	}

}
