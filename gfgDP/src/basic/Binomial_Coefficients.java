package basic;

public class Binomial_Coefficients {

	public static void main(String[] args) {
		int n=50,k=40;
	//	System.out.println(bino(n,k));// O(2^N)
	System.out.println(binos(n,k));// O(k)// nCr
	}

	private static int binos(int n,int k) {
	int nume=n,deno=Math.min(k, n-k);
int res=1;
	for(int i=1;i<=deno;i++)
	{res=res*(nume-i+1);res=res/i;}
		return res;
	}

	private static int bino(int n, int k) {
		if(k>n)return 0;
		if(k==0||k==n)return 1;
		
		return bino(n-1,k)+bino(n-1,k-1);
	}

}
