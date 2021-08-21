package gfgbasic;

import java.util.Scanner;

public class Rotate_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,g=0;
				
				
				n=sc.nextInt();
				
				
				l=sc.nextInt();
				int a[]=new int [n];
				int b[]=new int [n];
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  b[i]=a[i];
				
				}
				for(int i=0;i<l;i++)
				{
					
					b[n-l+i]=a[i];
				}
				
				for(int i=0;i<n-l;i++)
				{
					
					b[i]=a[i+l];
				}
			
				
				for(int i:b)
				{
				System.out.print(i+" ");
				}
				
				System.out.println();
			
				t--;
		 }
		
		
//			for(int i=0;i<l;i++)
//			{
//		g=a[0];
//				for(int j=0;j<n;j++)
//				{
				    
//				    if(j==(n-1))
//				    {
//				        a[j]=g;
//				    }else
//				    {
//					a[j]=a[j+1];
//				    }
						
//				}
				
				
//			}
		
	}

}
