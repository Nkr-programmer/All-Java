package gfgfasinatig;

import java.util.Scanner;

public class Competion_scoreboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0;
				boolean x=false;
				
				
				
				
				int a[]=new int [3];
				int b[]=new int [3];
				for(int i=0;i<3;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<3;i++)
				{
					
					b[i]=sc.nextInt();
				  
				
				}
			
				
				
				for(int i=0;i<3;i++)
				{
				if(a[i]>b[i])
				{
					
					k++;
				}else
					if(a[i]==b[i])
					{}
				
				else
				{
					
					h++;
				}
				
				}
				
				System.out.print(k+" "+h);
				
				System.out.println();
			
				t--;
		 }
		
		
		
		
	}

}
