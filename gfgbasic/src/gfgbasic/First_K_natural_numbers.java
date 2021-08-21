package gfgbasic;

import java.util.Scanner;

public class First_K_natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=1,h=0,g=0;
				int y=Integer.MAX_VALUE;
				boolean x=false;
				
				n=sc.nextInt();
				l=sc.nextInt();
			int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=1;i<y;i++)
				{
					
					for(int j=0;j<n;j++)
					{
					if(i==a[j])
					{
						x=false;
						break;
					}
					else
					{
						x=true;
					}
					
					}
					
					if((x==true)&&(g<=l))
					{
						System.out.print(i+" ");
						g++;
						if(g==l)
						{
							break;
						}
					}
					
				
				}
				
				System.out.println();
				
				
				
				
				t--;
		 }
		
		
		
		
		
		
		
	}

}
