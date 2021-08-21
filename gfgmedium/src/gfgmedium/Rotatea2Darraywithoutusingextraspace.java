package gfgmedium;

import java.util.Arrays;
import java.util.Scanner;

public class Rotatea2Darraywithoutusingextraspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k=1,h=0,g=0,m;
				boolean x=false;
				
				n=sc.nextInt();
				
				int a[][]=new int [n][n];
				
				for(int i=0;i<n;i++)
				{
					
					
						
					for(int j=0;j<n;j++)
					{
						
						
							
							a[i][j]=sc.nextInt();
						  
		
					}
					  
	
				}
				
				for(int i=0;i<n;i++)
				{
					
					
						
					for(int j=0;j<n;j++)
					{
						
						
							
					System.out.print(" "+a[i][j]);
						  
		
					}
					  System.out.println();
	
				}
				
				
				
				
				
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						
						
							
							if(j==(n-1)&&(i<n-1))
							{
								m=a[i][n-1];
								a[i][n-1]=a[0][i];
								a[0][i]=m;
								
								
							
								m=a[0][i];
								a[0][i]=a[n-1-i][0];
								a[n-1-i][0]=m;
							
								
								
							}
							
					//		if(j>((n-1)/2)&&(j<n-1))
							
							
			
		
					}
				
				}
				
				
				
				
				
		
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						
						
							
							
							
						if((j==n-1)&&(i>0))	{
							m=a[n-1][i];
							a[n-1][i]=a[i][0];
							a[i][0]=m;
							}
		
					}
				
				}
				
				
				
				
				
				
				
				for(int i=0;i<n;i++)
				{
					
					
						
					for(int j=0;j<n;j++)
					{
						
						
							
					System.out.print(" "+a[i][j]);
						  
		
					}
					  System.out.println();
	
				}
				
				
				
				System.out.println();
				
				t--;
		 }
	}

}

//m=a[i][n-1];
//a[i][n-1]=a[0][i];
//a[0][i]=m;
//
//
//m=a[0][i];
//a[0][i]=a[n-1][i];
//a[n-1][i]=m;
//
//
//m=a[n-1][n-1];
//a[n-1][n-1]=a[n-1][i];
//a[n-1][i]=m;



//for(int i=0;i<n;i++)
//{
//	for(int j=0;j<n;j++)
//	{
//		
//		
//			
//			if(j==(n-1)&&(i<n-1))
//			{
//				m=a[i][n-1];
//				a[i][n-1]=a[0][i];
//				a[0][i]=m;
//				
//				
//			
//				m=a[0][i];
//				a[0][i]=a[n-1-i][0];
//				a[n-1-i][0]=m;
//			
//				
//				
//			}
//			
//
//
//	}
//
//}
//
//
//
//
//
//
//
//for(int i=0;i<n;i++)
//{
//	for(int j=0;j<n;j++)
//	{
//		
//		
//			
//			
//			
//		if((j==n-1)&&(i>0))	{
//			m=a[n-1][i];
//			a[n-1][i]=a[i][0];
//			a[i][0]=m;
//			}
//
//	}
//
//}