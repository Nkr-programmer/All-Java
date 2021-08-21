package basic;

public class Catalan_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=80;//O(n)
System.out.println(catalan(n));

	}

	private static int catalan(int n) {
	int nume=2*n,deno=n;
	if(deno>nume-deno) {deno=nume-deno;}
int res=1;
	for(int i=1;i<=deno;i++)
	{res=res*(deno+i);res=res/i;}
		return res/(n+1);
	}

}