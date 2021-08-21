package binaryanddecimal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.Vector;

public class Cn2 {


		public static void main(String[] args) throws java.lang.Exception{
				
	        
	        
	        
	        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	        int n = Integer.parseInt(st.nextToken());

	        int k = Integer.parseInt(st.nextToken());

				 st = new StringTokenizer(br.readLine());
			
	   Integer a[]= new  Integer[n];
			for(int i=0;i<n;i++)
			{
				a[i]= Integer.parseInt(st.nextToken());
			}
		double f=0;
		for(int i=0;i<=n-k;i++)
		{double s=0;
		int j=i;
			for( j=i;j<i+k;j++)
			{s=s+a[j];}
		if((s/k)>f)f=s/k;
		int j1=j;
		for( j1=j;j1<n;j1++)
		{
			s=s+a[j1];
			if(s/(j1-(i-1))>f)f=s/(j1-(i-1));
		}
		
		
		
		}
	
 
		 System.out.println( (int) (f * 1000000) / 1000000.0 );

		
		}

	}