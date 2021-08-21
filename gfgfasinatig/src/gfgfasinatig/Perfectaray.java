package gfgfasinatig;

import java.util.Scanner;

public class Perfectaray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		   int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 int a,c,d;
				boolean x=false;
				 a = sc.nextInt();
				 int b[]=new int[a];
				for(int i=0;i<a;i++)
				{
					b[i]=sc.nextInt();
					
				}
		
				for(int i=0;i<a;i++)
				{
					if(b[i]==b[a-i-1])
					{
						x=true;
						
					}else
					if(b[i]!=b[a-i-1])
					{
						x=false;
						break;
					}
					
				}	
				
				
				if(x==true)
				{
					System.out.println("perfect no.s");
				}
				else
				{
					System.out.println(" not perfect no.s");
					
				}
				
				
		
		t--;
		 }
		
		
		
	}

}
