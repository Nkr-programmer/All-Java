package advanced_concept;

import java.util.Arrays;
import java.util.Scanner;

public class Same_Nos_Of_Jobs_and_People_BITMASK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 for (int[] row : dp) {  
	                Arrays.fill(row, -1); 
	        } 
		 int n=4;
		 
		 for(int i=0;i<4;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 cost[i][j]=sc.nextInt();
			 }
		 }
		 
		System.out.println(solve(0,(1<<4)-1,4));

	}
	static int cost[][]=new int [4][4];
static int dp[][]=new int [4][1<<4];
	public static int solve(int i,int mask,int n )
{
		
		if(i==n) { return 0;}
		if(dp[i][mask]!=-1)return dp[i][mask];
		int ans=Integer.MAX_VALUE;
		for(int j=0;j<n;j++ )
		{
			if((mask&(1<<j))!=0)
			ans=Math.min(ans,cost[j][i]+ solve(i+1,mask^(1<<j),n));
		}
return dp[i][mask]=ans;
}
}


//same algo for travelling salesmen probem

//9 2 7 8
//6 4 3 7
//5 8 1 8
//7 6 9 4

//13