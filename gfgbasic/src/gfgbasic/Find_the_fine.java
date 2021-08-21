package gfgbasic;

import java.util.Scanner;

public class Find_the_fine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,date,k=0,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				date=sc.nextInt();
				int car[]=new int [n];
				int fine[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					car[i]=sc.nextInt();
			    }
			
				for(int i=0;i<n;i++)
				{
					
					fine[i]=sc.nextInt();
				  
				
				}
				
				
				for(int i=0;i<n;i++)
				{
				if(date%2==0) 
				{
				    if(car[i]%2!=0)	
				    {
				    	h=h+fine[i];
				    }
				}
				else
				{
					if(car[i]%2==0)	
				    {
					h=h+fine[i];
				    }
				}
				
				
				}
				
				System.out.print(h);
			    System.out.println();
				t--;
		 }
		
		
		
	}

}
