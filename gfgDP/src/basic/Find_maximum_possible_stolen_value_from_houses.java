package basic;

public class Find_maximum_possible_stolen_value_from_houses {

	public static void main(String[] args) {
		  int hval[] = {6, 7, 1, 3, 8, 2, 4};
	        int n = hval.length;
	        System.out.println("Maximum loot value : " + maxLoot(hval, n));
	}

	private static int maxLoot(int[] hval, int n) {
		int dp[]= new int[n];
		int max=0;
		dp[0]=hval[0];
		dp[1]=Math.max(hval[0],hval[1]);
		for(int i=2;i<n;i++)
		{
			dp[i]=Math.max(hval[i]+dp[i-2],dp[i-1]);
		}
		for(int k:dp) {System.out.print(k+" ");}
		
		return dp[n-1];
	}

}
