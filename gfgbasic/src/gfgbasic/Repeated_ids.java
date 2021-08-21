package gfgbasic;

import java.util.Scanner;

public class Repeated_ids {

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
				int b[]=new int [n];
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				for(int i=0;i<n;i++)
				{
					
					for(int j=0;j<n;j++)
					{
						
					if((a[i]!=a[j])&&(i!=j))
					{
						x=true;
					}
					else
					if((a[i]==a[j])&&(i!=j)){
						
						
						x=false;
						break;
					}
					
					}
				  if(x==true)
				  {
					  System.out.print(a[i]+" ");
					  
				  }
				  
				  
				  
				  
				
				}
				
				System.out.println();
				
				
			
				t--;
		 }
		 
		 
		 
		 
		 
	}

}
