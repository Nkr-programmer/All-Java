package kickstart;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class B3 {
	
	static long N=0;
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Integer.parseInt(br.readLine());long c=1;
		while(T>0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			  N = Integer.parseInt(st.nextToken());
			  long  q = Integer.parseInt(st.nextToken());
			
			HashMap<Long,ArrayList<long[]>>tru= new HashMap<Long,ArrayList<long[]>>();
			for(int i=0;i<N-1;i++)
			{st = new StringTokenizer(br.readLine());
			long  x = Long.parseLong(st.nextToken());
			long  y = Long.parseLong(st.nextToken());
			long  l = Long.parseLong(st.nextToken());
			long  a = Long.parseLong(st.nextToken());
				if(!tru.containsKey(x))
				{
					tru.put(x,new ArrayList<long[]>() {});
				}long[]s=new long[3];s[0]=y;s[1]=l;s[2]=a;
				tru.get(x).add(s);
				if(!tru.containsKey(y))
				{
					tru.put(y,new ArrayList<long[]>() {});
				}long[]si=new long[3];si[0]=x;si[1]=l;si[2]=a;
				tru.get(y).add(si);
			}
			
			long d[]=new long[(int) q];
			
			for(int i=0;i<q;i++)
			{
			st = new StringTokenizer(br.readLine());
			long  x = Integer.parseInt(st.nextToken());
			long  y = Integer.parseInt(st.nextToken());
			d[i]=	Dfs(x,y,tru);
				
				
			}
			
			
			System.out.print("Case #"+c+": ");
			for(long g:d) {System.out.print(g+" ");}
			System.out.println();
               T--;c++;
	}
	}
	
	 static long gcd(long a, long b)
	    {
	        if (a == 0)
	            return b;
	        return gcd(b % a, a);
	    }
	 
	    // Function to find gcd of array of
	    // numbers
	    static long findGCD(ArrayList<Long> f2, long n)
	    {
	    	long result = 0;
	        for (long element: f2){
	            result = gcd(result, element);
	 
	            if(result == 1)
	            {
	               return 1;
	            }
	        }
	 
	        return result;
	    }
	
	private static long Dfs(long x, long y, HashMap<Long, ArrayList<long[]>> tru) {
		v=false;
		f= new ArrayList<Long>();
		boolean ch[] = new boolean[(int) (N+1)];
			if (ch[(int) x] == false)
				dfs(x, ch,tru,y);
			return findGCD(f,f.size());
	}
static boolean v=false;
static ArrayList<Long>f;
	private static void dfs(long i, boolean[] x, HashMap<Long, ArrayList<long[]>> tru, long y) {
		// TODO Auto-generated method stub
		x[(int) i] = true;
		
		if(i==1) {v=true;return;}

		for (int j = 0; j < tru.get(i).size(); j++) {
			long n = tru.get(i).get(j)[0];
			if(v==false) {if(y>=tru.get(i).get(j)[1]) {f.add(tru.get(i).get(j)[2]);}}
			if (!x[(int) n]) {
				dfs(n, x,tru,y);
				
			}
		}

	}

}
