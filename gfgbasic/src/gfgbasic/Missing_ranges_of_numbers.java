package gfgbasic;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_ranges_of_numbers {

	public static void main(String[] args) {
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
				for(int i=0;i<n-1;i++)
				{
					if(a[i+1]-a[i]==2)
					{System.out.print(a[i+1]-1+" ");}
					else
						if((a[i+1]-a[i]==1)&&(i!=0)){System.out.print("");}
//						
						
				else {
								
								if((a[i]<2)&&(i==0)) {
								
									if(a[i]==1)
										System.out.print("0 ");
									else
										if(a[0]==2)
											System.out.print("0-1 ");
							            	}
								else
									if((a[i]>=2)&&(i==0)) {
									
									System.out.print("0-"+(a[0]-1)+" ");
								     }
								
								if(a[0]!=1)
							System.out.print((a[i]+1)+"-"+(a[i+1]-1)+" ");
						}
				}
				
				
				if((n==1)&&(a[0]==0))
				{
					System.out.print("-1");
				}
				else
					if((n==1))
				{
					System.out.print("0-"+(a[0]-1));
				}
				
				System.out.println();
				
				
				
				t--;
		 }

	}

}
