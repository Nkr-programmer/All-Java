package basic;

import java.util.Arrays;

public class Largest_Divisible_Pair_Subset {

	public static void main(String[] args) {
        int[] a = { 1, 3, 6, 13, 17, 18 };
        int n = a.length;
        System.out.println("\n"+largestSubset(a, n));
		}

	private static int largestSubset(int[] a, int n) {
		int dp[]= new int[n];
		dp[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{int mxm=0;
			for(int j=i+1;j<n;j++) 
			{
			if(a[i]%a[j]==0||a[j]%a[i]==0) {mxm=Math.max(mxm, dp[j]);}	
			}
			dp[i]=1+mxm;
		}
		
		for(int l:dp)
		System.out.println(l);
		
		
		return Arrays.stream(dp).max().getAsInt();
	}
}
