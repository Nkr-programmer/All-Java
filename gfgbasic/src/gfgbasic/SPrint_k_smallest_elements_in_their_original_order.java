package gfgbasic;

import java.util.Scanner;

public class SPrint_k_smallest_elements_in_their_original_order {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=Integer.MAX_VALUE;
				boolean x=false;
				
				n=sc.nextInt();
				
				l=sc.nextInt();
				int a[]=new int [n];
				int b[]=new int [l];
				int c[]=new int [n];
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
					c[i]=a[i];
				  
				
				}
			h=g;
				for(int i=0;i<l;i++)
				{
					for(k=0;k<n;k++) {
						
					a[k]=c[k];
					if(i>0) {
					for(int e=0;e<i;e++) {
					a[b[e]]=h;	
					}
					}
					}
					
					g=Integer.MAX_VALUE;
					
					
					for(int j=0;j<n;j++)
					{
					if(g>a[j])
					{
						
						b[i]=j;
						g=a[j];
						
					
						
					}
				  
					}
				}

				int y=1;

				for(int j=0;j<n;j++)
				{
					for(int i=0;i<l;i++)
					{
						if(c[j]==c[b[i]])
						{
						    while(y<=l){
							System.out.print(c[j]+" ");
						    y++;
					break;
					
						    }
					}
					
					}
				}
				
				System.out.println();
				
				
			
				t--;
		 }
		
		
		
		

	}

}
