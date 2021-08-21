package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array_in_groups {

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
		
				
//				for(int j=0;j<n/l;j++)
//				{
//				for(int i=0;i<n;i++)
//				{
//					
//					
//						if(i<l/2+j*l/2)
//						{
//						g=a[i+j*l];
//						a[i+j*l]=a[l-1-i+j*l];
//						a[l-1-i+j*l]=g;
//							
//						}
//				
//					
//				}
//				}
				for(int i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}

			System.out.println();
				
		t--;
		 }
		
		
		
		
	}

}
