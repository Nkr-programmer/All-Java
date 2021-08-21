package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Distinct_Adjacent_Element {

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
				
					
					for(int i=0;i<n-1/2;i++)
					{
						
						for(int j=i+2;j<n;j++)
						{
							
						if(a[i]==a[i+1])
						{
							if(a[i+1]!=a[j])
							{
								k=a[j];
								a[j]=a[i+1];
								a[i+1]=k;
						break;		
							}
							
							
							
						
							}
							
							
							
						
							
							
						
						}
					  
					
					}
					
					
					for(int i=0;i<n-1/2;i++)
					{
						
						for(int j=i+2;j<n;j++)
						{
							
					
							
						if(a[n-1-i]==a[n-1-i-1])
						{
							if(a[n-1-i-1]!=a[n-j-1])
							{
								k=a[n-1-j];
								a[n-1-j]=a[n-1-i-1];
								a[n-1-i-1]=k;
								break;
							}
							
							
							
						}	
							
							
							
							
						
						}
					  
					
					}
					
					
					for(int i=0;i<n-1;i++)
					{
						if(a[i]==a[i+1])
						{
							x=true;
							
							break;
						}
						else {
							
								x=false;
							
						}
					}
					
					
					
					
					
					if(x==true)
					{
						System.out.print("NO");
					}
					else {
						
						System.out.print("YES");
					}
					
					
				System.out.println();
					t--;
			 }
			
		
		
		
		
		
	}

}
