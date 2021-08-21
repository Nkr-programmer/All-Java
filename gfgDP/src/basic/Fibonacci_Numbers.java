package basic;

import java.math.BigInteger;

public class Fibonacci_Numbers {

	public static void main(String[] args) {
int n=100;
//O(n)
int a=0,b=1,c=0;
for(int i=2;i<=n;i++)
{c=a+b;a=b;b=c;}
		System.out.println(c);

//O(logn)
		int a1[][]= {{1,1},{1,0}};
	power(n-1,a1);
	System.out.println(a1[0][0]);
	//used this algo in optimation
	System.out.println( power(2,10));//O(logi)
// O(1)
	double phi = (1 + Math.sqrt(5)) / 2;
		System.out.println( (int) Math.round(Math.pow(phi, n)/ Math.sqrt(5)));
//O(n) same as 1st but its work on every one biginteger concept
 	System.out.println(fib(n));

 	
 	
 	
//	BigInteger h[][];
//	h= new BigInteger[5][5];
//	h[0][0]= BigInteger.valueOf(0);
		
	}
	static BigInteger fib(int n)
    {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }
  
        return (b);
    }
	private static int power(int n, int i) {
		if(i==0)return 1;
		int temp=power(n,i/2);
		if(i%2==0) {return temp*temp;}
		else {return temp*temp*n;}
	}

	private static void power(int n, int[][] a1) {
		if(n==0||n==1)
		return;
	int a[][]= {{1,1},{1,0}};
	power(n/2,a1);
	multiply(a1,a1);// commonly multiply a1*a1;
	if(n%2!=0)
	{multiply(a1,a);}// odd case already done (a1*a1)*a;
	}

	private static void multiply(int[][] F, int[][] M) {
		 int x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
		    int y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
		    int z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
		    int w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];
		      
		    F[0][0] = x;
		    F[0][1] = y;
		    F[1][0] = z;
		    F[1][1] = w;
	}

}
