package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursive_sequence {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//testcases
		while(T-->0)
		{
			sequence obj=new sequence();
		    long n;
		    n=sc.nextLong();
		    System.out.println(obj.josephus(n));
		}
	}
}

// } Driver Code Ends


class sequence
{
	
   
public long josephus(long n) {
	long h=0;
	for(int i=1;i<=n;i++) {k=1;
	 h=h+ josephusutil(i,(i*(i+1))/2);
	// System.out.println(h+" "+k);
	 System.out.println(h+" "+k);
	  
}
	return h;
}
static long k=1;
private long josephusutil(long i,long n) {
	// TODO Auto-generated method stub
	if(i==0)return n+1;
	k=k*n;
	josephusutil(i-1,n-1);
	
return k;
}
}

