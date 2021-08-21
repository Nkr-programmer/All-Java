package advanced_concept;

import java.util.Arrays;

public class DIGIT_DP_OP {

	public static void main(String[] args) {
		 for (int[][] row : dp) { 
	            for (int[] rowColumn : row) { 
	                Arrays.fill(rowColumn, -1); 
	            } 
	        } 
		System.out.println(solve("1120343423443535","1120343423443535".length(),12,1));

	}
static int dp[][][]=new int [100][1801][2];
//	num is upperlimit ,n is nos of digits, x is sum,
	public static int solve(String num,int n,int x,int tight )
{
		if(x<0)return 0;
		if(n==1) {
	if(x>=0&&x<=9)return 1;
	else return 0;
}
		if(dp[n][x][tight]!=-1)return dp[n][x][tight];
		int ans=0;
		int ub=tight==1?num.charAt(num.length()-n)-'0':9;
		for(int dig=0;dig<=ub;dig++ )
		{
			ans+=solve(num,n-1,x-dig,tight==1&&ub==dig?1:0);
		}
return dp[n][x][tight]=ans;
}
}
//There are many types of problems that ask to count the number of integers ‘x‘
//between two integers say ‘a‘ and ‘b‘ such that x satisfies a specific property that
//can be related to its digits.