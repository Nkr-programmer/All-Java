package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Max_value_after_m_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,m,a,b,k;
				boolean x=false;
				
				n=sc.nextInt();
				
				m=sc.nextInt();
				int arr[]=new int [n];
				
				
				for(int i=0;i<m;i++)
				{
					
					a=sc.nextInt();
					b=sc.nextInt();
					k=sc.nextInt();
					
				  
					for(int j=a;j<=b;j++)
					{
					arr[j]=arr[j]+k;
					}
				
				}
			
				Arrays.sort(arr);
				
				System.out.print(arr[n-1]);
				
				System.out.println();
			
				t--;
		 }
		
		
		
		
		
		
	}

}
