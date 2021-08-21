package basic;

import java.io.IOException;
import java.util.Scanner;

public class GFSeries {
	  public static void main(String args[])throws IOException
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t-- > 0)
	        {
	            int N=sc.nextInt();
				
	            GF ob = new GF();
	            ob.gfSeries(N);
	            
	        }
	    }
	}
	
/////// BIG INTEGER REMEBER DOESNOT HAVE LIMIT
	class GF{
	    static void gfSeries(int N){
	    
for(int i = 1; i <= N; i++){
	System.out.print(gfSeriesUtil(i) +" ");
}
System.out.println();
	    }

		private static long gfSeriesUtil(int n) {
			// TODO Auto-generated method stub
			
		if(n==1)return 0;
		if(n==2)return 1;
			
	long x=gfSeriesUtil(n-2);
	x=x*x;
		return x-gfSeriesUtil(n-1);
		}
	}