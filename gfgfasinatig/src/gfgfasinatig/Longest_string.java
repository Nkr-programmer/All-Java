package gfgfasinatig;

import java.util.Scanner;

public class Longest_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
			 int n,m,v=0;
				String l,k="",h="",g="";
				boolean x=false;
				
				m=sc.nextInt();
				
				n=m+1;
				String a[]=new  String[n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextLine();
				  
				
				}
			
				for(int i=0;i<n;i++)
				{
					
					if(v<a[i].length())
					{
						v=a[i].length();
					h=a[i];	
						
					}
				}
				
				System.out.println(h);
				
				
			
				t--;
		 }
		
		
		
	}

}
