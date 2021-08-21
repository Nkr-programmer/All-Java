package gfgbasic;

import java.util.Scanner;

public class Total_distance_travelled_in_a_array {

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
			
				for(int i=1;i<=n;i++)
				{
				
					for(int j=0;j<n;j++)
					{
					
						if(i==a[j])
						{
							
							b[i-1]=j;
						}
						
					}
					
					
				}
				
				
				for(int j=0;j<n-1;j++)
				{
					if(b[j]>b[j+1])
					{
					h=h+b[j]-b[j+1];
					}
					else
						if(b[j]<b[j+1])
						{
						h=h+b[j+1]-b[j];
						}	
					
					
				}
				
				
				System.out.print(h);
				System.out.println();
				
			
				t--;
		 }
	}

	}


