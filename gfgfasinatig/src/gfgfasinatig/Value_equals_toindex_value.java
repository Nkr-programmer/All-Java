package gfgfasinatig;

import java.util.Scanner;

public class Value_equals_toindex_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n;
				boolean x=false;
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
			
				for(int i=0;i<n;i++)
				{
				if(a[i]==(i+1))
				{
					
					System.out.print((i+1)+" ");
					x=true;
				}
				else {
					
				}
				}
				
								if(x==false)
					{
					    System.out.print("NOT FOUND");
					    break;
					    
					}
					
				System.out.println();
				
		t--;
		 }
		
		
		
		
		
		
	}

}
