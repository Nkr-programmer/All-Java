package ternary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KickStart {

public static void main(String[] args) throws  IOException {
	
		int iz=1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Long.parseLong(br.readLine());
		while (T > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n=0,x=0;
				 n = Long.parseLong(st.nextToken());
			x=Long.parseLong(st.nextToken());
			StringBuilder t=new StringBuilder();
			st = new StringTokenizer(br.readLine());
		String h=	st.nextToken();
		
			t.append(h);
			int count =0;
			
				for(int i=0;i<n/2;i++)
				{
				
					if(t.charAt(i)!=t.charAt((int) (n-1-i))) {count++;}
					
				}
		if(x>n/2){System.out.println("Case #"+(iz++)+": "+0);}
			else
		System.out.println("Case #"+(iz++)+": "+Math.abs(count-x));
			T--;
		}
		
		
	}

}
