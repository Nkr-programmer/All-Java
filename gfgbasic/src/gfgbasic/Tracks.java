package gfgbasic;

import java.util.Scanner;

public class Tracks {

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
			
				for(int i=0;i<(n/2)-1;i++)
				{
					
				
					if((a[i+1]==a[n-i-2])&&(a[(n-1)/2]==1)&&(a[i+2]-a[i+1]==a[i+1]-a[i])&&(a[0]==a[n-1]))
					{
						x=true;
					}
					else {
						
						x=false;
						break;
						
					}
				  
				
				}
				
				if(x==true)
				{
					System.out.print("Yes");
				}
				else
				{
					System.out.print("No");
				}
				System.out.println();
				
			
				t--;
		 }
		
		
		
		
	}

}
