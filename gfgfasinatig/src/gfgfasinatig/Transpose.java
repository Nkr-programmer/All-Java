package gfgfasinatig;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k=0;
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
					if(i==j)
					{
						
						a[i][j]=a[i][j];
					}
					else
						if(i>j)
					{
						k=a[i][j];
						a[i][j]=a[j][i];
						a[j][i]=k;
					     }
				 
				  
				  }
				
				}
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
				  {
				System.out.print(a[i][j]);
				
				  }
				System.out.println();
				}
				
				
				
				t--;
		 }
		
		 
	}

}
