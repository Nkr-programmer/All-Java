package gfgmedium;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_K_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		

		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k,h=0,g=0,m;
				boolean x=false;
				
				k=sc.nextInt();
				
				int a[][]=new int [k][k];
				
				for(int i=0;i<k;i++)
				{
					
					
						
					for(int j=0;j<k;j++)
					{
						
						
							
							a[i][j]=sc.nextInt();
						
					}
					
				}
				
				  
				int d[]=new int [k*k];
	int q=0;
				
				for(int i=0;i<k;i++)
				{
					
					for(int j=0;j<k;j++)
					{
						
						d[q]=a[i][j];
						
							q++;
					}
					
						
				}
				
				for(int i=0;i<q;i++)
				{
				System.out.print(d[i]+" ");
				}
				
				
				
			
				System.out.println();
				
				t--;
		 }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
