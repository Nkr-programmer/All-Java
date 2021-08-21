package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Partition_Point_in_the_Array {

	public static void main(String[] args) {
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 long k=1;
				int n,l,h=0,g=0;
				boolean x=false;
				
				n=sc.nextInt();
				
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					
					a[i]=sc.nextInt();
				  
				
				}
			
				
				for(int i=0;i<n;i++)
				{
					k=a[i];
					for(int j=0;j<n;j++)
					{
						
						if(a[i]==k)
						{
							if((a[j]<a[i])&&(j<i))
							{x=true;}
							else
								if((a[j]>a[i])&&(j>i))
								{x=true;}
								else
								if((a[j]==a[i])&&(j==i))
								{x=true;
								}
								else{x=false;
								    break;
								}
						}
					  
					
					}
				  if(x==true)
				  {
					  System.out.print(k);
					  g++;
					  break;
				  }
				
				}
				
			if((g==0))
			{
			     System.out.print("-1"); 
			}
			
//			if(n==1)
//			{
//			  System.out.print(a[0]);   
//			}
			
				System.out.println();
			
				t--;
		 }
	}

}
