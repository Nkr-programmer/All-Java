package gfgfasinatig;

import java.util.Scanner;

public class Rascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l;
				
				n=sc.nextInt();
				l=n;
				
				int a[][]=new int [n][n];
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<=i;j++)
					{
						if((j==0)||(i==j))
						{
						a[i][j]=1;
						}
						else
						{
							
							a[i][j]=a[i-1][j]+a[i-1][j-1];
							
						}
						
					}
					
					
				}
				
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<=i;j++)
					{
						if(i==(l-1)) {
						System.out.print(a[i][j]+" ");
						      }
						
					}
					
					
				}
			
		t--;
		 }
		
		
		
		
	}

}
