package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Geek_Onacchi {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long  a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());
			long  c = Integer.parseInt(st.nextToken());
			long  n= Integer.parseInt(st.nextToken());
			
		geeko(a,b,c,n);
		
		
		T--;
	}
	
}

	private static void geeko(long a, long b, long c, long n) {
		// TODO Auto-generated method stub
		
		
			System.out.print(geekoutil(a,b,c,n) +" ");
		
		System.out.println();
	}

	private static long geekoutil(long a, long b, long c, long n) {
		// TODO Auto-generated method stub
		if(n==1)return a;
		if(n==2)return b;
		if(n==3)return c;
	
	
	return geekoutil(a,b,c,n-1)+geekoutil(a,b,c,n-2)+geekoutil(a,b,c,n-3);
	}
	}