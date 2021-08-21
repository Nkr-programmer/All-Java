package kickstart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class D1 {


	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());int C=1;
		while(T>0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long  a = Long.parseLong(st.nextToken());
			long  b = Long.parseLong(st.nextToken());
			long  c = Long.parseLong(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			long  d = Long.parseLong(st.nextToken());
			long  e = Long.parseLong(st.nextToken());

			st = new StringTokenizer(br.readLine());
			long  f = Long.parseLong(st.nextToken());
			long  g = Long.parseLong(st.nextToken());
			long  h = Long.parseLong(st.nextToken());
			
			
			int cou=0;
			if((a+c)%2==0 &&((a+c)/2)==b) {cou++;}
			if((f+h)%2==0 &&((f+h)/2)==g) {cou++;}
			if((a+f)%2==0 &&((a+f)/2)==d) {cou++;}
			if((c+h)%2==0 &&((h+c)/2)==e) {cou++;}
			
			ArrayList<Long> ha= new ArrayList<Long>();	
			HashMap<Long,Integer> m= new HashMap<Long,Integer>();
			
			if((a+h)%2==0) 
			{long s=(a+h)/2;ha.add(s); if(!m.containsKey(s)) 
			{m.put(s, 1);}else {m.put(s,m.get(s)+1);} }
			
			if((b+g)%2==0) 
			{long s=(b+g)/2;ha.add(s); if(!m.containsKey(s)) 
			{m.put(s, 1);}else {m.put(s,m.get(s)+1);} }
			
			if((c+f)%2==0) 
			{long s=(c+f)/2;ha.add(s); if(!m.containsKey(s)) 
			{m.put(s, 1);}else {m.put(s,m.get(s)+1);} }
			
			if((d+e)%2==0) 
			{long s=(d+e)/2;ha.add(s); if(!m.containsKey(s)) 
			{m.put(s, 1);}else {m.put(s,m.get(s)+1);} }
			
			
			int ma=0;
			for(Long xx:ha) {ma=Integer.max(ma,m.get(xx));}
			cou+=ma;
			
			System.out.print("Case #"+C+": "+cou);
			System.out.println();
               T--;C++;
	}
	
}
}