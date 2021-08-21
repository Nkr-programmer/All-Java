package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Missing_And_Repeating {

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
		Arrays.sort(a);
				
				
		
		for(int i=0;i<n;i++)
		{
			
			
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					k=i;
					break;
				}
			}
		}
		int d=1;
		for(int c=0;c<n;c++)
		{
			if(a[c]==d)
				{d++;}
			
		}
			System.out.println(a[k]+" "+d);	
			System.out.println();
				
		t--;
		 }
		
		
		
		
		
		
		
		
		
		
		
	}

}
