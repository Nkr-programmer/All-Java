package gfgfasinatig;

import java.util.Scanner;

public class Find_index {

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
			
				l=sc.nextInt();
				
				for(int i=0;i<n;i++)
				{
					if(a[i]==l)
					{
						System.out.print(i+" ");
						break;
					}
				}
				
				
				for(int i=n-1;i>=0;i--)
				{
					if(a[i]==l)
					{
						System.out.print(i);
						break;
					}
				}
				
				System.out.println();
			
				t--;
		 }
		
		
	}

}
