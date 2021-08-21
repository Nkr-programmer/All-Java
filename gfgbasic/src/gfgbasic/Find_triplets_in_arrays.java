package gfgbasic;

import java.util.Scanner;

public class Find_triplets_in_arrays {

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
			
			
					
			for(int i=0;i<n;i++)
			{
					for(int j=i+1;j<n;j++)
					{
						h=0;
						h=h+a[i]+a[j];
						
						
					
						for(int z=j+1;z<n;z++)
						{
							g=h;
							
							h=h+a[z];
							if(h==0) {
								x=true;
								
								break;
							}
							
							h=g;
							
						}
					
					}
			}
				
				System.out.print(x);
				System.out.println();
				
				
				
			
				t--;
		 }
		
		
		
	}

}
