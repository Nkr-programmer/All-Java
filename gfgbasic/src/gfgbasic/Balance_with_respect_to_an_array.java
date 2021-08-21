package gfgbasic;

import java.util.Scanner;

public class Balance_with_respect_to_an_array {

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
				
					
					for(int j=0;j<n;j++)
					{
					
						
						if(a[n-1]<l)
						{
							System.out.print("Balanced");
						x=true;
							break;
						}
						
						if(a[0]>l) 
						{
							
						System.out.print("Balanced");
						x=true;
						break;
						}
						
						if(a[j]>l)
						{
							k=a[j];
							g=a[j-1];
							break;
						}
						else
							if(a[j]==l)
							{
								k=a[j];
								g=a[j];
								break;
							}
					
					}
				
					if((l-g==k-l)&&(x==false))
					{
						System.out.print("Balanced");
					}
					else
					{
						System.out.print("Not Balanced");
					}
				
				
				
				
				
				
				System.out.println();
			
				
		
		t--;
		 }
		
		
		
		
		
	}

}
