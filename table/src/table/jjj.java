package table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class jjj {

    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int knapSack(int n, int W, int val[], int wt[])
    {  int dp[]=new int[W+1];
    Arrays.fill(dp,-1);
        int x= maximize(val,n,W,wt,dp);
	    return x<0?0:x;
	}
	 public static int maximize(int cost[], int N,int W,int wt[],int dp[])
    {
        if(W==0)return 0;
        int x=Integer.MIN_VALUE;
    //    if(dp[W]!=-1)return dp[W];
        for(int i=0;i<N;i++)
        {  if(W>=wt[i]) x=Math.max(x,cost[i]+maximize(cost,N,W-wt[i],wt,dp)); }
    return dp[W]=x; 
    }
}