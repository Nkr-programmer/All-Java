package basic;

import java.util.Arrays;

public class IMPMin_Cost_Path {


    private static int minCost(int cost[][], int m, int n)
    {
        int i, j;
        int tc[][]=new int[m+1][n+1];
        tc[0][0] = cost[0][0];
        for (i = 1; i <= m; i++)
            tc[i][0] = tc[i-1][0] + cost[i][0];
        for (j = 1; j <= n; j++)
            tc[0][j] = tc[0][j-1] + cost[0][j];
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                tc[i][j] = Math.min(tc[i-1][j-1],
                               Math.min(tc[i-1][j],
                               tc[i][j-1])) + cost[i][j];
 
        return tc[m][n];
    }
    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};
        System.out.println(minCost(cost,2,2));
// O(n2) always same algo
    //    for max
        
        int Mat[][] = { { 4, 2, 3, 4 },
                { 2, 9, 1, 10 },
                { 15, 1, 3, 0 },
                { 16, 92, 41, 44 } };

System.out.println(MaximumPath(Mat));
        // Maximum path sum that starting with any cell of 
        //0-th row and ending with any cell of (N-1)-th row


int M[][] = {{0, 1, 1, 0, 1}, 
        {1, 1, 0, 1, 0}, 
        {0, 1, 1, 1, 0},
        {1, 1, 1, 1, 0},
        {1, 1, 1, 1, 1},
        {0, 1, 0, 1, 0}};
  
  System.out.println(printMaxSubSquare(M));
// Maximum size square sub-matrix with all 1s
    }
	private static int printMaxSubSquare(int[][] m) {
		int r=m.length,c=m[0].length;
		int dp[][]= new int [r][c];
		for(int i=0;i<r;i++) {dp[i][0]=m[i][0];}
		for(int i=0;i<c;i++) {dp[0][i]=m[0][i];}
		int x=0;
		for(int i=1;i<r;i++)
		{
			for(int j=1;j<c;j++)
			{
				if(m[i][j]==1)
				{
					dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1], dp[i-1][j]))+1;
				 x= Math.max(x,dp[i][j]);
				}
			}
		}
	
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{System.out.print(dp[i][j]+" ");}		System.out.println();
		}
		
		return x;
	}
	private static int MaximumPath(int[][] mat) {
  int n=mat.length;
		int dp[][]	= new int[n][n+2];
		for(int i=0;i<n;i++)
		{Arrays.fill(dp[i], 0);}
		
		for(int i=0;i<n;i++)
		{dp[0][i+1]= mat[0][i];}
for(int i=1;i<n;i++)
for(int j=1;j<=n;j++)
{dp[i][j]=Math.max(dp[i-1][j], Math.max(dp[i-1][j-1], dp[i-1][j+1]))+mat[i][j-1];}

int max=0;
for(int i=1;i<=n;i++)
{max=Math.max(max, dp[n-1][i]);}
		return max;
	}

}
