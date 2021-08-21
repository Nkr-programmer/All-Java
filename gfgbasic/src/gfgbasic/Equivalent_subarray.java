package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Equivalent_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,h=0,g=0,m=0;
			
			int	k=Integer.MIN_VALUE;
				n=sc.nextInt();
				
				
				
				int a[]=new int [n];
				int p[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
					p[i]=a[i];
				  
				
				}
			
				
				Arrays.sort(p);
				for(int i=0;i<n;i++)
				{
					
					if(k<p[i])
					{
						k=p[i];
						g++;
					}
					
				}
				
				
				
		
				
				
			
				
				
				
	
				
				for(int i=0;i<n-g+1;i++) {
					
					for(int j=0;j<=i;j++)                                     {
						k=Integer.MIN_VALUE;
						 
						 
						 for(int z=j;z<j+n-i;z++)             {
							 p[z]=a[z];
								Arrays.sort(p);
								System.out.print(p[z]);
//							 if(k<p[z])
//							 {
//								 
//								 k=p[z];
//								h++; 
//							 }
					         
					                                            }System.out.println();
						 if(h==g)
						 {
							 
							 m++;
							
						 }
						 h=0;
				                                                            	}
					
					                    }
				
				System.out.print(m);
				System.out.println();
				
			
				t--;
		 }
		
		
		
		
		
		
	}

}
