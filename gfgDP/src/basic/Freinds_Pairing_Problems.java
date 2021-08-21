package basic;

import java.util.Arrays;

public class Freinds_Pairing_Problems {

	public static void main(String[] args) {
		int n=17;
		System.out.println(pairing(n));
		int dp[]= new int[n+1];		
		Arrays.fill(dp, -1);
		System.out.println(pairings(n,dp));
		// both are O(n);
	}

	private static int pairing(int n) {
		int dp[]= new int[n+1];
		for(int i=0;i<=n;i++)
		{
			if(i<=2)dp[i]=i;
			else {dp[i]=dp[i-1]+(i-1)*dp[i-2];}
		}		
		
		return dp[n];
	}

	private static int pairings(int n,int []dp) 
		{
	        if (dp[n] != -1)
	            return dp[n];
	 
	        if (n > 2)
	            return dp[n] = pairings(n - 1,dp) + (n - 1) * pairings(n - 2,dp);
	        else
	            return dp[n] = n;
	    }
	
	
}
