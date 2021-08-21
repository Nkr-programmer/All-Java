package kickstart;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());int c=1;
		while(T>0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int  N = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			String s= st.nextToken();
		char x[]= s.toCharArray();
			int  y[]= new int[N];
			int h=1;
			for(int i=0;i<N-1;i++)
			{
				y[i]=h;
				if(x[i]>=x[i+1]) {h=1;}
				else {h++;}
			}
			if(x.length>1) {
			if(x[x.length-1]>x[x.length-2]) {y[x.length-1]=h++;}
			if(x[x.length-1]<=x[x.length-2]) {y[x.length-1]=1;}
			}
			else {
				y[x.length-1]=1;
			}
			System.out.print("Case #"+c+": ");
			for(int g:y) {System.out.print(g+" ");}
			System.out.println();
               T--;c++;
	}
	
}
}