package gfgbasic;

import java.util.Scanner;

public class Tywins_War_Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,g=0,m=0,y=0;
				boolean x=false;
				
				n=sc.nextInt();
				l=sc.nextInt();
				
				int a[]=new int [n];
				
				for(int i=0;i<n;i++)
				{
					k=0;
					g=0;
					for(int j=0;j<n;j++)
					{
						if(a[j]%l==0)
						{
							g++;
						}else {
							k=a[j]%l;
							if((k<h)||(j==0))
							{
								m=j;
								h=k;
							}
						}
						
						
						
					}
					a[m]=a[m]+h;
					y=y+h;
					if(g>=l/2)
					{
						break;
					}
				}
			
	System.out.print(y);
					System.out.println();
				
				
				
				
				t--;
		 }
		
		
		
		
		
		
		
		
		
		
	}

}
