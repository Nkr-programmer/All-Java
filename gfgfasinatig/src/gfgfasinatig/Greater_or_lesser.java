package gfgfasinatig;

import java.util.Scanner;

public class Greater_or_lesser {

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
				
				
				
				for(int i=0;i<n;i++)
				{
					if(a[i]>l)
					{
						h++;
						
					}
					else
					if(a[i]<l)
					{
						g++;
						
					}
					else
						if(a[i]==l)
					{
					h=h+1;
					g=g+1;
			     	}
				
				}
				
				System.out.print(g+" "+h);
				System.out.println();
				
				t--;
		 }
		
		 
		
		
		
		
		
	}

}
