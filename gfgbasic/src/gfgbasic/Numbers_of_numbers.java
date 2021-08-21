package gfgbasic;

import java.util.Scanner;



public class Numbers_of_numbers {
	  public static int num(int a[], int n, int k)
      {
		 
		  Scanner sc = new Scanner(System.in); 
				int z=0,h=0,g=0;
				boolean x=false;
				
				
	
		
				for(int i=0;i<n;i++)
				{
					z=a[i];
					for(int j=0;j<n;j++)
					{
						
						if(z!=0) {
						g=z%10;
						z=z/10;
						if(g==k)     {
							h++;
						             }
						         }
						
						
					
					}	
					
				  
				
				}
				
				
				
				return h;
			
					
		
		
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Scanner sc = new Scanner(System.in);

		  int t;
		   
			int n,k;
			int x=0;
			
			t=sc.nextInt();
			
			n=sc.nextInt();
			
			int 	  a[]=new int [n];		
			for(int i=0;i<n;i++)
			{
				
				a[i]=sc.nextInt();
			  
			
			}
		
			
			k=sc.nextInt();
		  
		  while(t>0) {
			Numbers_of_numbers y=new Numbers_of_numbers();
		//x=	y.num(a[] ,  n,  k);
		  System.out.println();
		    t--;
		  }
	
	}
// all most done and in submitted also
}
