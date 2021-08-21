package gfgmedium;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Product_of_Increasing_Subsequence_of_Size_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k,h=0,g=0,m=0;
				boolean x=false;
				k=Integer.MIN_VALUE;
				n=sc.nextInt();
				
				int a[]=new int [n];
				int b[]=new int [3];
				
				for(int i=0;i<n;i++)
				{
						a[i]=sc.nextInt();
				}
			
			int y=0,i=0;
				while(i<n)
				{
					for(int j=i;j<n;j++)
					{
						
					if(a[n-1-j]>k)
					{
						k=a[n-1-j];
						m=n-1-j;
					}
						
					}
					System.out.print(a[m]);
				i=m+1;
				if(y!=0) {
				if(a[m]<b[y])
				{
					b[y]=a[m];
					y++;
				}
				}
				else {
					b[y]=a[m];
					y++;
				}
				
				
				}
				
				
			//	System.out.print(b[0]+" "+b[1]+" "+b[2]);
				
				
				
				
				
				System.out.println();
				
				t--;
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
