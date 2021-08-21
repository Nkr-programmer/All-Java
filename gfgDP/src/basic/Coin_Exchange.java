package basic;

import java.util.Arrays;

public class  Coin_Exchange{

	public static void main(String[] args) {
	int n=8,k=1;
System.out.println(makechange(n,1));// if its not in array
int m1= n;
int dp1[]= new int[n+1];dp1[0]=1;
for(int i=1;i<=m1;i++)
{
for(int j=i;j<=n;j++)	{dp1[j]=dp1[j]+dp1[j-i];	}
}
System.out.println(dp1[m1]);
//Different_ways_sum_n_using_numbers_greater_equal_m


int a[]= {1,2,3,4,5,6,7,8};
System.out.println(coin(a,n,a.length));
// DP solution O(mn)
int m= a.length;
int dp[]= new int[n+1];dp[0]=1;
for(int i=0;i<m;i++)
{
for(int j=a[i];j<=n;j++)	{dp[j]=dp[j]+dp[j-a[i]];	}
}
System.out.println(dp[dp.length-1]);
	//coin change   **** MOST IMPORTANT
	
	
int coins[]= {1,2,5,10};int nz=27;
// DP solution O(mn)
int mz= coins.length;
int dpz[]= new int[nz+1];
Arrays.fill(dpz, nz+1);
dpz[0]=0;
for(int i=1;i<=nz;i++)
{
for(int j=0;j<mz;j++)	 if (coins[j] <= i){dpz[i]=Math.min(dpz[i],1+ dpz[i-coins[j]]) ;}
}

System.out.println( dpz[nz]>nz?-1:dpz[nz]);
// Find minimum number of coins that make a given value  ***** IMPORTANT

	}

	private static int coin(int[] a, int n, int m) {
	if(n<0)return 0;
	if(n==0)return 1;
	if(n>=1&&m<=0) {return 0;}
		return coin(a,n,m-1)+coin(a,n-a[m-1],m);
	}

	private static int makechange(int n, int k) {
	if(k>n)return 0;
	if(k==n)return 1;
	return makechange(n,k+1)+makechange(n-k,k);
	}

}
