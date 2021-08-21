package gfgbasic;

import java.util.Scanner;

public class Shortest_unordered_subarray {

	public static void main(String[] args) {

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
			
				for(int i=1;i<n-1;i++)
				{
					if((a[i]>a[i+1])&&(a[i]>a[i-1]))
							{
						System.out.print("3");
						x=true;
						break;
							}
					else
						if((a[i]<a[i+1])&&(a[i]<a[i-1]))
								{
							System.out.print("3");
							x=true;
							break;
								}
						else
						{
							x=false;
						}
				
				}
				
		if(x==false)
		{
			System.out.print("0");
		}
				
				
				System.out.println();
				
				
			
				t--;
		 }
	}

}
