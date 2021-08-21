package gfgbasic;

import java.util.*;

public class Sorting_Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
	
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,l,k=0,h=0,s=0,g=Integer.MAX_VALUE;
				boolean x=false;
				String m="";
				n=sc.nextInt();
				
				int a[]=new int [n];
				
				String f[]=new String[n];
				for(int i=0;i<n;i++)
				{
					
					f[i]=sc.next();
					a[i]=sc.nextInt();
				}
			
			for(int i=0;i<n;i++)
			{g=Integer.MAX_VALUE;
				for(int j=i;j<n;j++)
				{

					if(a[j]<g)
					{
						g=a[j];
						h=j;
					}
					else
						if(a[j]==g)
						{
						s=	f[j].compareTo(f[h]);
						if(s<0)
						{
							h=j;
						}
						}
					
					
					
				}
	
				k=g;
				a[h]=a[i];
				a[i]=k;
				
				m=f[h];
				f[h]=f[i];
				f[i]=m;
				
			}
				
//			for(int i=0;i<n;i++)
//			{g=Integer.MAX_VALUE;
//				for(int j=i;j<n;j++)
//				{
//
//					if(a[j]<g)
//					{
//						g=a[j];
//						h=j;
//					}
//					else
//						if(a[j]==g)
//						{
//						s=	f[j].compareTo(f[h]);
//						if(s<0)
//						{
//							h=j;
//						}
//						}
//					
//					
//				}
//	
//				k=g;
//				a[h]=a[i];
//				a[i]=k;
//				
//				m=f[h];
//				f[h]=f[i];
//				f[i]=m;
//				
//			}
			
			
			for(int y=0;y<n;y++)
			{
				System.out.print(f[y]+" "+a[y]+" ");
				
				
			}
				
				System.out.println();
				
				
			
				t--;
		 }
		 
		 
		
		
		
		
		
		
		
	}

}
