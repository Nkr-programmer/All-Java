package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_triplet_sum_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
		
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
			
//				int max = 0, sec_max = 0, thrd_max = 0;
//				for(int i = 0; i<n; i++)
//				{ if(a[i]>=max) {
//				thrd_max = sec_max;
//				sec_max = max;
//				max = a[i];
//				}
//				}
//			g=thrd_max + sec_max+max;
				
				Arrays.sort(a);
				g=a[n-1]+a[n-2]+a[n-3];
				
				System.out.print(g);
			System.out.println();
				t--;
		 }
		
		
		
		
		
		
		
		
		
	}

}
