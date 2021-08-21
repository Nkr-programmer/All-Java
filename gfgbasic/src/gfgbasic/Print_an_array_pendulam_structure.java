package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Print_an_array_pendulam_structure {

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
				int b[]= new int [n];
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			Arrays.sort(a);
			
			if(n%2==0) {
				b[(n-1)/2]=a[0];
			}
			else{
				b[n/2]=a[0];
			}
			
			
			k=1;l=1;
			for(int i=1;i<n;i++)
			{
				
				if(i%2==0) {
					
					b[((n-1)/2)-k]=a[i];
							k++;
			             	}
				else {
					
					b[((n-1)/2)+l]=a[i];
							l++;
			             	}
				
				
			}
			for(int y:b)
			{
				System.out.print(y+" ");
			}
			
				
				
				System.out.println();
				
			
				t--;
		 }
		
		
		
		
		
		
	}

}
